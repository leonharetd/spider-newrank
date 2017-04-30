# spider-newrank
新榜内容抓取(http://www.newrank.cn)

# 网站分析
## 请求签名
通过chrome调试工具调试发现新榜网站数据部分使用了ajax请求，这为
内容抓取提供了极大便利。通过尝试多种不同请求发现每次请求都需要2个必要参数`nonce` `xyz`，
猜测这就是请求签名之类的东西，顾名思义，nonce是个随机串，xyz像是md5摘要。这种请求签名方法在
前端js代码里面肯定能找到蛛丝马迹的，于是继续分析，发现一个`seajs-config-front.js`这种js文件请求，
随便进去一搜果然发现里面有nonce，进而发现nonce其实就是一个随机9位字符串，而xyz是将uri
和请求参数、APPKEY、nonce等按一定顺序拼起来的结果的md5摘要。有个nonce和xyz的生成规则
那么各种ajax请求就可以随心所欲了。