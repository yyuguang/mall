## 前言

**api请求格式**

```
http://yours ip/api/
```



## 1.用户模块

#### 1.登录

**POST /user/login**

> request

Content-Type: application/json

```
{
	"username":"admin",
	"password":"admin",
}
```
> response

fail
```
{
    "status": 1,
    "msg": "密码错误"
}
```

success
```
{
    "status": 0,
    "data": {
        "id": 12,
        "username": "aaa",
        "email": "aaa@163.com",
        "phone": null,
        "role": 0,
        "createTime": 1479048325000,
        "updateTime": 1479048325000
    }
}
```

-------

#### 2.注册
**POST /user/register**

> request

```
{
	"username":"admin",
	"password":"admin",
	"email":"admin@qq.com"
}
```


> response

success
```
{
    "status": 0,
    "msg": "校验成功"
}
```


fail
```
{
    "status": 2,
    "msg": "用户已存在"
}
```


#### 3.获取登录用户信息
**GET /user/userInfo**

> request

```
无参数
```
> response

success
```
{
    "status": 0,
    "data": {
        "id": 12,
        "username": "aaa",
        "email": "aaa@163.com",
        "phone": null,
        "role": 0,
        "createTime": 1479048325000,
        "updateTime": 1479048325000
    }
}
```

fail
```
{
    "status": 10,
    "msg": "用户未登录,无法获取当前用户信息"
}

```

------


#### 4.退出登录
**POST /user/logout**

> request

```
无
```

> response

success

```
{
    "status": 0,
    "msg": "退出成功"
}
```

fail
```
{
    "status": -1,
    "msg": "服务端异常"
}
```


## 2.商品类目模块

#### 1.所有类目

**GET /category/categories**

> request

**无需登录**

> response

**success**

```
{
    "status": 0,
    "data": [{
        "id": 100001,
        "parentId": 0,
        "name": "家用电器",
        "sortOrder": 1,
        "subCategories": [{
            "id": 100006,
            "parentId": 100001,
            "name": "冰箱",
            "sortOrder": 2,
            "subCategories": [{
                "id": 100040,
                "parentId": 100006,
                "name": "进口冰箱",
                "sortOrder": 1,
                "subCategories": []
            }]
        },  {
        "id": 100005,
        "parentId": 0,
        "name": "酒水饮料",
        "sortOrder": 1,
        "subCategories": [{
            "id": 100026,
            "parentId": 100005,
            "name": "白酒",
            "sortOrder": 1,
            "subCategories": []
        }, {
            "id": 100027,
            "parentId": 100005,
            "name": "红酒",
            "sortOrder": 1,
            "subCategories": []
        }]
    }]
}
```



## 3. 商品模块

#### 1.商品列表

**GET /product/products**

> request

```
categoryId(非必传，子类目的商品也要查出来)
pageNum(default=1)
pageSize(default=10)

```

> response

success

```
{
    "status": 0,
    "data": {
        "pageNum": 1,
        "pageSize": 10,
        "size": 2,
        "orderBy": null,
        "startRow": 1,
        "endRow": 2,
        "total": 2,
        "pages": 1,
        "list": [
            {
                "id": 1,
                "categoryId": 3,
                "name": "iphone7",
                "subtitle": "双十一促销",
                "mainImage": "mainimage.jpg",
                "status":1,
                "price": 7199.22
            },
            {
                "id": 2,
                "categoryId": 2,
                "name": "oppo R8",
                "subtitle": "oppo促销进行中",
                "mainImage": "mainimage.jpg",
                "status":1,
                "price": 2999.11
            }
        ],
        "firstPage": 1,
        "prePage": 0,
        "nextPage": 0,
        "lastPage": 1,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ]
    }
}
```

------

#### 2.商品详情

**GET /product/products/{productId}**

> request

```
productId
```

> response

success

```
{
  "status": 0,
  "data": {
    "id": 2,
    "categoryId": 2,
    "name": "oppo R8",
    "subtitle": "oppo促销进行中",
    "mainImage": "mainimage.jpg",
    "subImages": "[\"mmall/aa.jpg\",\"mmall/bb.jpg\",\"mmall/cc.jpg\",\"mmall/dd.jpg\",\"mmall/ee.jpg\"]",
    "detail": "richtext",
    "price": 2999.11,
    "stock": 71,
    "status": 1,
    "createTime": "2016-11-20 14:21:53",
    "updateTime": "2016-11-20 14:21:53"
  }
}

```

fail
```
{
    "status": 1,
    "msg": "该商品已下架或删除"
}
```


## 4. 购物车模块

#### 1.购物车List列表

**GET /cart/list**

> request

```
无参数,需要登录状态
```

> response

success

```
{
    "status": 0,
    "data": {
        "cartProductVoList": [
            {
                "productId": 1,
                "quantity": 1,
                "productName": "iphone7",
                "productSubtitle": "双十一促销",
                "productMainImage": "mainimage.jpg",
                "productPrice": 7199.22,
                "productStatus": 1,
                "productTotalPrice": 7199.22,
                "productStock": 86,
                "productSelected": true,
            },
            {
                "productId": 2,
                "quantity": 1,
                "productName": "oppo R8",
                "productSubtitle": "oppo促销进行中",
                "productMainImage": "mainimage.jpg",
                "productPrice": 2999.11,
                "productStatus": 1,
                "productTotalPrice": 2999.11,
                "productStock": 86,
                "productSelected": false,
            }
        ],
        "selectedAll": false,
        "cartTotalPrice": 10198.33,
        "cartTotalQuantity": 2
    }
}

```

fail

```
{
    "status": 10,
    "msg": "用户未登录,请登录"
}
```

------

#### 2.购物车添加商品

**POST /cart/add**

> request

```
productId
selected: true
```

`注意`数量不用传，添加商品永远是以1累加

> response

success

```
{
    "status": 0,
    "data": {
        "cartProductVoList": [
            {
                "productId": 1,
                "quantity": 12,
                "productName": "iphone7",
                "productSubtitle": "双十一促销",
                "productMainImage": "mainimage.jpg",
                "productPrice": 7199.22,
                "productStatus": 1,
                "productTotalPrice": 86390.64,
                "productStock": 86,
                "productSelected": true
            },
            {
                "productId": 2,
                "quantity": 1,
                "productName": "oppo R8",
                "productSubtitle": "oppo促销进行中",
                "productMainImage": "mainimage.jpg",
                "productPrice": 2999.11,
                "productStatus": 1,
                "productTotalPrice": 2999.11,
                "productStock": 86,
                "productSelected": true
            }
        ],
        "selectedAll": true,
        "cartTotalPrice": 89389.75,
        "cartTotalQuantity": 13
    }
}
```

fail

```
{
    "status": 10,
    "msg": "用户未登录,请登录"
}
```

------





#### 3.更新购物车

**PUT /cart/update/{productId}**

> request

```
quantity //非必填
selected: true //非必填
```

> response

响应同2

success

```
{
    "status": 0,
    "data": {
        "cartProductVoList": [
            {
                "productId": 1,
                "quantity": 12,
                "productName": "iphone7",
                "productSubtitle": "双十一促销",
                "productMainImage": "mainimage.jpg",
                "productPrice": 7199.22,
                "productStatus": 1,
                "productTotalPrice": 86390.64,
                "productStock": 86,
                "productSelected": true
            },
            {
                "productId": 2,
                "quantity": 1,
                "productName": "oppo R8",
                "productSubtitle": "oppo促销进行中",
                "productMainImage": "mainimage.jpg",
                "productPrice": 2999.11,
                "productStatus": 1,
                "productTotalPrice": 2999.11,
                "productStock": 86,
                "productSelected": true,
            }
        ],
        "selectedAll": true,
        "cartTotalPrice": 89389.75,
        "cartTotalQuantity": 13
    }
}
```

fail

```
{
    "status": 10,
    "msg": "用户未登录,请登录"
}
```

------



#### 4.移除购物车某个产品

**DELETE /cart/delete/{productId}**

> request

```
productId
```

> response

success

```
{
    "status": 0,
    "data": {
        "cartProductVoList": [
            {
                "productId": 2,
                "quantity": 1,
                "productName": "oppo R8",
                "productSubtitle": "oppo促销进行中",
                "productMainImage": "mainimage.jpg",
                "productPrice": 2999.11,
                "productStatus": 1,
                "productTotalPrice": 2999.11,
                "productStock": 86,
                "productSelected": true
            }
        ],
        "selectedAll": true,
        "cartTotalPrice": 2999.11,
        "cartTotalQuantity": 1
    }
}
```

fail

```
{
    "status": 10,
    "msg": "用户未登录,请登录"
}
```

------

#### 5.全选中

**PUT /cart/selectAll**

> request

```
无参数,需要登录状态
```

> response

success

同接口 获取购物车列表

------

#### 6.全不选中

**PUT /cart/unSelectAll**

> request

```
无参数,需要登录状态
```

> response

success

同接口 获取购物车列表

------

#### 7.获取购物中所有商品数量总和

**GET /cart/products/sum**

> request

```
无参数,需要登录状态
```

> response

```
{
    "status": 0,
    "data": 2
}
```



## 5.收货地址模块

#### 1.添加地址

**POST /shipping/add**


> request

```
receiverName=廖师兄
receiverPhone=010
receiverMobile=18688888888
receiverProvince=北京
receiverCity=北京市
receiverDistrict=海淀区
receiverAddress=中关村
receiverZip=100000
```

> response

success

```
{
    "status": 0,
    "msg": "新建地址成功",
    "data": {
        "shippingId": 28
    }
}
```

fail
```
{
    "status": 1,
    "msg": "新建地址失败"
}
```

------


#### 2.删除地址

**DELETE /shipping/delete/{shippingId}**

> request

```
shippingId
```

> response

success

```
{
    "status": 0,
    "msg": "删除地址成功"
}
```

fail
```
{
    "status": 1,
    "msg": "删除地址失败"
}
```

------


#### 3.更新地址

**PUT /shipping/update/{shippingId}**

> request

```
receiverName=廖师兄
receiverPhone=010
receiverMobile=18688888888
receiverProvince=北京
receiverCity=北京市
receiverDistrict=海淀区
receiverAddress=中关村
receiverZip=100000
```

> response

success

```
{
    "status": 0,
    "msg": "更新地址成功"
}
```

fail
```
{
    "status": 1,
    "msg": "更新地址失败"
}
```

------


####4.地址列表

**GET /shipping/list**

> request

```
pageNum(默认1),pageSize(默认10)
```

> response

success

```
{
    "status": 0,
    "data": {
        "pageNum": 1,
        "pageSize": 10,
        "size": 2,
        "orderBy": null,
        "startRow": 1,
        "endRow": 2,
        "total": 2,
        "pages": 1,
        "list": [
            {
                "id": 4,
                "userId": 13,
                "receiverName": "廖师兄",
                "receiverPhone": "010",
                "receiverMobile": "18688888888",
                "receiverProvince": "北京",
                "receiverCity": "北京市",
                "receiverDistrict": "海淀区",
                "receiverAddress": "中关村",
                "receiverZip": "100000",
                "createTime": 1485066385000,
                "updateTime": 1485066385000
            },
            {
                "id": 5,
                "userId": 13,
                "receiverName": "廖师兄",
                "receiverPhone": "010",
                "receiverMobile": "18688888888",
                "receiverProvince": "北京",
                "receiverCity": "北京市",
                "receiverDistrict": "海淀区",
                "receiverAddress": "中关村",
                "receiverZip": "100000",
                "createTime": 1485066392000,
                "updateTime": 1485075875000
            }
        ],
        "firstPage": 1,
        "prePage": 0,
        "nextPage": 0,
        "lastPage": 1,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ]
    }
}
```

fail
```
{
    "status": 1,
    "msg": "请登录之后查询"
}
```


## 6.订单模块

#### 1.创建订单

**POST /order/add**

> request

```
shippingId
```

> response

success

```
{
    "status": 0,
    "data": {
        "orderNo": 1291136461000,
        "payment": 2999.11,
        "paymentType": 1,
        "postage": 0,
        "status": 10,
        "paymentTime": null,
        "sendTime": null,
        "endTime": null,
        "closeTime": null,
        "createTime": 1291136461000,
        "orderItemVoList": [
            {
                "orderNo": 1291136461000,
                "productId": 2,
                "productName": "oppo R8",
                "productImage": "mainimage.jpg",
                "currentUnitPrice": 2999.11,
                "quantity": 1,
                "totalPrice": 2999.11,
                "createTime": null
            }
        ],
        "shippingId": 5,
        "shippingVo": {
                "id": 4,
                "userId": 13,
                "receiverName": "廖师兄",
                "receiverPhone": "010",
                "receiverMobile": "18688888888",
                "receiverProvince": "北京",
                "receiverCity": "北京市",
                "receiverDistrict": "海淀区",
                "receiverAddress": "中关村",
                "receiverZip": "100000",
                "createTime": 1485066385000,
                "updateTime": 1485066385000
            }
    }
}
```

fail
```
{
    "status": 1,
    "msg": "创建订单失败"
}
```

------

#### 2.订单List

**GET /order/list**

> request

```
pageSize(default=10)
pageNum(default=1)
```

订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭

> response

success

```
{
  "status": 0,
  "data": {
    "pageNum": 1,
    "pageSize": 3,
    "size": 3,
    "orderBy": null,
    "startRow": 1,
    "endRow": 3,
    "total": 16,
    "pages": 6,
    "list": [
      {
        "orderNo": 1291136461000,
        "payment": 2999.11,
        "paymentType": 1,
        "paymentTypeDesc": "在线支付",
        "postage": 0,
        "status": 10,
        "statusDesc": "未支付",
        "paymentTime": "2010-02-11 12:27:18",
        "sendTime": "2010-02-11 12:27:18",
        "endTime": "2010-02-11 12:27:18",
        "closeTime": "2010-02-11 12:27:18",
        "createTime": "2010-01-23 16:04:36",
        "orderItemVoList": [
          {
            "orderNo": 1291136461000,
            "productId": 2,
            "productName": "oppo R8",
            "productImage": "mainimage.jpg",
            "currentUnitPrice": 2999.11,
            "quantity": 1,
            "totalPrice": 2999.11,
            "createTime": "2010-01-23 16:04:36"
          }
        ],
        "shippingId": 5,
        "receiverName": "廖师兄",
        "shippingVo": null
      },
      {
        "orderNo": 1291136461001,
        "payment": 2999.11,
        "paymentType": 1,
        "paymentTypeDesc": "在线支付",
        "postage": 0,
        "status": 10,
        "statusDesc": "未支付",
        "paymentTime": "2010-02-11 12:27:18",
        "sendTime": "2010-02-11 12:27:18",
        "endTime": "2010-02-11 12:27:18",
        "closeTime": "2010-02-11 12:27:18",
        "createTime": "2010-01-23 16:04:35",
        "orderItemVoList": [
          {
            "orderNo": 1291136461001,
            "productId": 2,
            "productName": "oppo R8",
            "productImage": "mainimage.jpg",
            "currentUnitPrice": 2999.11,
            "quantity": 1,
            "totalPrice": 2999.11,
            "createTime": "2010-01-23 16:04:35"
          }
        ],
        "shippingId": 5,
        "receiverName": "廖师兄",
        "shippingVo": null
      },
      {
        "orderNo": 1291136461002,
        "payment": 2999.11,
        "paymentType": 1,
        "paymentTypeDesc": "在线支付",
        "postage": 0,
        "status": 10,
        "statusDesc": "未支付",
        "paymentTime": "2010-02-11 12:27:18",
        "sendTime": "2010-02-11 12:27:18",
        "endTime": "2010-02-11 12:27:18",
        "closeTime": "2010-02-11 12:27:18",
        "createTime": "2010-01-23 16:04:35",
        "orderItemVoList": [
          {
            "orderNo": 1291136461002,
            "productId": 2,
            "productName": "oppo R8",
            "productImage": "mainimage.jpg",
            "currentUnitPrice": 2999.11,
            "quantity": 1,
            "totalPrice": 2999.11,
            "createTime": "2010-01-23 16:04:35"
          }
        ],
        "shippingId": 5,
        "receiverName": "廖师兄",
        "shippingVo": null
      }
    ],
    "firstPage": 1,
    "prePage": 0,
    "nextPage": 2,
    "lastPage": 6,
    "isFirstPage": true,
    "isLastPage": false,
    "hasPreviousPage": false,
    "hasNextPage": true,
    "navigatePages": 8,
    "navigatepageNums": [
      1,
      2,
      3,
      4,
      5,
      6
    ]
  }
}
```

fail
```
{
  "status": 10,
  "msg": "用户未登录,请登录"
}


或

{
  "status": 1,
  "msg": "没有权限"
}



```

------

#### 3.订单详情

**GET /order/detail/{orderNo}**

> request

```
orderNo
```

> response

success

```
{
  "status": 0,
  "data": {
    "orderNo": 1291136461000,
    "payment": 30000.00,
    "paymentType": 1,
    "paymentTypeDesc": "在线支付",
    "postage": 0,
    "status": 10,
    "statusDesc": "未支付",
    "paymentTime": "",
    "sendTime": "",
    "endTime": "",
    "closeTime": "",
    "createTime": "2010-11-30 22:23:49",
    "orderItemVoList": [
      {
        "orderNo": 1291136461000,
        "productId": 1,
        "productName": "iphone7",
        "productImage": "mainimage.jpg",
        "currentUnitPrice": 10000.00,
        "quantity": 1,
        "totalPrice": 10000.00,
        "createTime": "2010-11-30 22:23:49"
      },
      {
        "orderNo": 1291136461000,
        "productId": 2,
        "productName": "oppo R8",
        "productImage": "mainimage.jpg",
        "currentUnitPrice": 20000.00,
        "quantity": 1,
        "totalPrice": 20000.00,
        "createTime": "2010-11-30 22:23:49"
      }
    ],
    "shippingId": 3,
    "receiverName": "廖师兄",
    "shippingVo": {
      "receiverName": "廖师兄",
      "receiverPhone": "0100",
      "receiverMobile": "186",
      "receiverProvince": "北京",
      "receiverCity": "北京",
      "receiverDistrict": "昌平区",
      "receiverAddress": "慕课网",
      "receiverZip": "100000"
    }
  }
}

```

fail
```
{
  "status": 1,
  "msg": "没有找到订单"
}
```

------

#### 4.取消订单

**PUT /order/cancel/{orderNo}**

> request

```
orderNo
```

> response

success

```
{
  "status": 0
}

```

fail
```
{
  "status": 1,
  "msg": "该用户没有此订单"
}

或
{
  "status": 1,
  "msg": "此订单已付款，无法被取消"
}
```

------