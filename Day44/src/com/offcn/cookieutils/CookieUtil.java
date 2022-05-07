package com.offcn.cookieutils;

import javax.servlet.http.Cookie;

public class CookieUtil {
    public  static Cookie findCookie(Cookie[] cs,String p){
        if (cs !=null){
            for (Cookie c : cs) {
                 if (p.equals(c.getName())){
                     //此时包含cookie
                     return c;
                 }
            }
        }
        return  null;
    }
}
