String[] words = sentence.split(" "); // O(K) where K = number of words in the sentence StringBuilder result = new StringBuilder(); for (String word: words) { O(K), iterating over K words char[] chars word.toCharArray(); O(N). converting each word of length N to a char array for (int i = word.length() 1; i >= 0; i--) O(N), iterating through each word in reverse result.append(chars[i]); // 0(1), appending character } result.append(" "); // 0(1), appending a space System.out.println(result.toString()); // 0(1) Step-by-Step Time Complexity: 1. sentence.split(" "): • Splits the sentence into words. • If the sentence contains K words, the time complexity is O(K). 2. Outer for Loop (for (String word: words)): • Iterates over all K words in the sentence. Complexity: O(K). 3. word.toCharArray(): • Converts each word (of length N) into a character array. • If the average word length is N, this step is O(N) for each word. • For K words, it contributes O(K N). Inner for Loop (for (int word.length() 1; i >= 0; i--)): • Reverses each word. • This runs O(N) for a single word of length N. • For K words, it contributes O(K x N). result.append(chars[i]) and result.append(" "): • Appending to a StringBuilder is O(1). • For K words, appending the characters and spaces is O(K × N). 6. System.out.println(result.toString()): • Printing the final result is O(1). Total Time Complexity: Combining all the above steps: • Splitting: O(K) • Char array conversion: O(K A • Reversing and appending: O(K × N) Overall Time Complexity: O(K × N) Where: • K = number of words in the sentence • N = average length of the words Space Complexity: Intermediate storage: o words array: O(K). • chars array: O(N) for one word at a time. • StringBuilder: Stores the entire result,