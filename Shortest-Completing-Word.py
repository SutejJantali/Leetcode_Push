class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
                # Step 1: Create a Counter for the letters in the licensePlate (ignore digits and spaces)

        license_counter = Counter(c.lower() for c in licensePlate if c.isalpha() == True)

        # Step 2: Find the shortest word that contains all letters from licensePlate

        def check(word):
            word_Counter = Counter(word)
            # Check if word contains all the letters with at least the frequency from licensePlate

            for char, count in license_counter.items():
                if word_Counter[char] < count:
                    return False   
            return True
        # Step 3: Sort words by length and check which is a completing word

        words = sorted(words, key = len)
        for word in words:
            if check(word):
                return word

        return ""