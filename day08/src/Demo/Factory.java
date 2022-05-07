package Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Factory {
    // 属性 名字 . 地址
    //// 方法 修理汽车(修理汽车的轮胎数量)
        String name;
        String address;
        public void repairCar (Car i) {
            //将车轮个数都弄成4个
            i.num = 4;
            System.out.println("你的破车修好了");
        }

}
