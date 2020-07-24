/* Leetcode 204 Count Prime 
Count the number of prime numbers less than a non-negative

Example:
	Input: 10
	Output: 4
	Explanation: 2, 3, 5, 7 are prime number
*/

class Solution {
	public int countPrimes(int num) {
		boolean[] notPrime = new boolean[num];
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (notPrime[i] == false) {
				count++;
			}
			for (int j = 2; i * j < n; j++) {
				notPrime[i * j] = true;
			}
		}
		return count;
	}
}


