package com.zjm.day.primary.string;

/**
 * @Author zjm
 * @Description: 外观数列
 * @Date: Created in 17:07 2021/6/16
 * @Modified By:
 */
public class CountAndSay {


    /*
    先确立递归出口 n = 1时 为1
    对上一个结果进行遍历获取值
    设定计数器，计算同一个数字出现的次数
    如果数字相同，计数器加一
    若当前不满足，则将上次的值记录下，并重置计数器，重置需要判断是否重复的字符
    将最后的结果也追加到字符串上
    */

    public static void main(String[] args) {
        String s = countAndSay(31);
        System.out.println(s);
    }

        public static String countAndSay(int n) {
            // 递归出口
            if(n==1){
                return "1";
            }
            // 假设我们获得上一次的结果为 s1 = 112213
            String s1 = countAndSay(n - 1);
            // 定义结果
            StringBuilder result = new StringBuilder();
            // 对s1遍历处理获取值
            char local = s1.charAt(0);
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                // 设定计数器 计算同一个数字出现的次数 count
                if(s1.charAt(i) == local){
                    count++;
                }else {
                    // 不符合，记录下
                    result.append(count);
                    result.append(local);
                    count = 1;
                    local = s1.charAt(i);
                }
            }
            result.append(count);
            result.append(local);
            return result.toString();
        }


}
