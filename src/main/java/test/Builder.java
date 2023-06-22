package test;

import java.util.Arrays;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();   //创建一个StringBuilder来逐步构建一个字符串
        builder.append(666);   //拼接一个数字
        builder.append("老铁");   //拼接一个字符串
        builder.insert(2, '?');  //在第三个位置插入一个字符
        System.out.println(builder);   //差不多成形了，最后转换为字符串

        System.out.println(Arrays.asList("da", "2"));
    }
}
