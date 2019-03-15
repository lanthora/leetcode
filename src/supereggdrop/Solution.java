package supereggdrop;

public class Solution {

    public int superEggDrop(int K, int N) {
        int M = N;
        int i, j;
        int[][] table = new int[K + 1][M + 1];

        for (i = 1; i <= M; i++) {
            /* 初始化1个鸡蛋尝试i次 */
            table[1][i] = i;
        }

        for (j = 1; j <= K; j++) {
            /* 初始化j个鸡蛋尝试1次 */
            table[j][1] = 1;
        }

        /**
         * 策略是：尽可能的多使用鸡蛋，少使用尝试次数
         * 故遍历时，内层遍历鸡蛋，让鸡蛋先用完，
         * 外层便利尝试次数，不得已的时候增加尝试次数
         */

        for (i = 2; i <= M; i++) {
            for (j = 2; j <= K; j++) {
                table[j][i] = table[j - 1][i - 1] + table[j][i - 1] + 1;
                if (table[j][i] >= N) {
                    return i;
                }
            }
        }
        /**
         * 楼层数为1,或鸡蛋数为1时会走到这里
         * 楼层数为1时返回1，鸡蛋数为1时返回楼层数
         * 综上返回楼层数即可
         * */
        return N;
    }
}
