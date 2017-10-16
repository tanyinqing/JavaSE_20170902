package cn.edu.tsinghua.javase.collecton;

public class Array3D {
    public static void main(String[] args) {
//        多维数组
        int[][][] vector=new int[3][5][7];
//        可以循环赋值
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                for (int k = 0; k < vector[i][j].length; k++) {
                    vector[i][j][k] = i + j + k;
                    System.out.println(vector[i][j][k]);
                } // 255
            }
        }
    }
//    最大255维数组
//    2维数组在小的益智游戏里用的多


}

