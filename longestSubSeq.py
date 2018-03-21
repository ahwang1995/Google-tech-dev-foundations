#!/usr/bin/env python
import collections
import sys
def find_longest_word_in_string(letters, words):
    """letter_positions = collections.defaultdict(list)
    # For each letter in 'letters', collect all the indices at which it appears.
    # O(#letters) space and speed.
    for index, letter in enumerate(letters):
        letter_positions[letter].append(index)
    # For words, in descending order by length...
    # Bails out early on first matched word, and within word on
    # impossible letter/position combinations, but worst case is
    # O(#words # avg-len) * O(#letters / 26) time; constant space.
    # With some work, could be O(#W * avg-len) * log2(#letters/26)
    # But since binary search has more overhead
    # than simple iteration, log2(#letters) is about as 
    # expensive as simple iterations as long as 
    # the length of the arrays for each letter is
    # small.  If letters are randomly present in the
    # search string, the log2 is about equal in speed to simple traversal
    # up to lengths of a few hundred characters.              
    for word in sorted(words, key=lambda w: len(w), reverse=True):
        pos = 0
        for letter in word:
            if letter not in letter_positions:
                break
        # Find any remaining valid positions in search string where this
        # letter appears.  It would be better to do this with binary search,
        # but this is very Python-ic.
        possible_positions = [p for p in letter_positions[letter] if p >= pos]
        if not possible_positions:
            break
        pos = possible_positions[0] + 1
        else:
            # We didn't break out of the loop, so all letters have valid positions  
            return word"""

    #O(N+L) approach
    letterInd = [0] * len(words)
    numFound = [0] * len(words)
    matchingWords = []
    #create tuples initialized to zero
    while words:
        for word in words:
            curInd = words.index(word)
            print(words)
            print(matchingWords)
            firstFound = letters.find(word[numFound[curInd]],letterInd[curInd])
            if(firstFound >= 0):
                letterInd[curInd] = firstFound
                numFound[curInd] += 1
                if(numFound[curInd] == len(word)):
                    matchingWords.append(word)
                    print curInd
                    del letterInd[curInd]
                    del numFound[curInd]
                    del words[curInd]
            else:
                del letterInd[curInd]
                del numFound[curInd]
                del words[curInd]
    print(words)
    print(matchingWords)
    print(max(matchingWords,key=len))





D = ['able','ale','apple','bale','kangaroo']
letters = ('ableapplebalekangaroo')
find_longest_word_in_string(letters,D)

#if __name__ == '__main__':
    #print subdict(sys.argv[1], sys.argv[2:])