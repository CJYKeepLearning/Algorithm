public class LC_65 {
    /*
        有效数字（按顺序）可以分成以下几个部分：
        一个 小数 或者 整数
        （可选）一个 'e' 或 'E' ，后面跟着一个 整数
        小数（按顺序）可以分成以下几个部分：

        （可选）一个符号字符（'+' 或 '-'）
        下述格式之一：
        至少一位数字，后面跟着一个点 '.'
        至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
        一个点 '.' ，后面跟着至少一位数字

        整数（按顺序）可以分成以下几个部分：
        （可选）一个符号字符（'+' 或 '-'）
        至少一位数字
        部分有效数字列举如下：

        ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"]
        部分无效数字列举如下：

        ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
        给你一个字符串 s ，如果 s 是一个 有效数字 ，请返回 true 。
*/
    public boolean isNumber(String s) {
        String[] strings = s.split(".");
        //整数
        boolean pre = false;
        if (strings.length==1){
            char[] c = strings[0].toCharArray();
            if (c.length==1)
                pre = true;
            else {
                int cntP=0;
                int cntE=0;
                for (int i=0;i<c.length;i++){
                    if (!(c[i]>='0' && c[i]<='9')){
                        if(c[i]=='-' || c[i]=='+')
                            cntP++;
                        else
                            cntE++;
                        if (cntP>=2 || cntE>=1){
                            pre = false;
                            break;
                        }
                    }
                }
            }

        }else {
        }
        return true;
    }
}

