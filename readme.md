说明：该模型由三部分组成
1、注册中心
2、应用网关
3、服务应用
只展示了通过网关调用不同服务的路由，不实现业务处理


A、库存与订单应用
库存服务接口
http://localhost:8003/storePuls?goodsId=123&goodsNum=2
订单服务接口
http://localhost:8004/orderGen?goodsId=123&goodsNum=2

B、api网关
库存服务，订单服务可以分别部署多台然后通过api网关访问，
网关层通过accessToken进行鉴权操作,并根据路由配置路由到相应的服务
通过路由访问库存接口storePuls
http://localhost:8001/api-store/storePuls?accessToken=123456&goodsId=123&goodsNum=2
通过路由访问订单接口orderGen
http://localhost:8001/api-order/orderGen?accessToken=123456&goodsId=123&goodsNum=2



