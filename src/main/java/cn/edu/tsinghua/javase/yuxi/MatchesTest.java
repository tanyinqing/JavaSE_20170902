package cn.edu.tsinghua.javase.yuxi;

import java.util.regex.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MatchesTest
{
    public static void main(String[] args)
    {
        String[] mails =
                {
                        "kongyeeku@163.com" ,
                        "kongyeeku@gmail.com",
                        "ligang@crazyit.org",
                        "wawa@abc.xx"
                };
//        \w	单词字符：[a-zA-Z_0-9]  \\	反斜线字符
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        //匹配的字符串
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail : mails)
        {
            if (matcher == null)
            {
                matcher = mailPattern.matcher(mail);
            }
            else
            {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是" : "不是")
                    + "一个有效的邮件地址！";
            System.out.println(result);
        }
    }
}
