// class Solution {
//     public boolean checkDivisibility(int n) {
//         int c = n;
//         int a = 0;
//         int b = 0;
//         int d = 1;

//         while (c > 0) {
//             a = c % 10;
//             b += a;
//             d *= a;
//             c = c / 10;
//         }

//         if (n % b == 0 || n % d == 0) {
//             return true;
//         }

//         return false;
//     }
// }

class Solution {
    public boolean checkDivisibility(int n) {
        int c = n;
        int sum = 0;
        int product = 1;

        while (c > 0) {
            int digit = c % 10;

            sum += digit;
            product *= digit;

            c /= 10;
        }

        return n % (sum + product) == 0;
    }
}