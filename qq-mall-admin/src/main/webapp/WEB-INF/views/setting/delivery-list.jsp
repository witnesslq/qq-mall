<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="../include/taglib.jsp"%>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta name="desc" content="">
    <meta name="author" content="">
    <title>快递公司管理 - ${site.title}</title>
    <%@include file="../include/head.jsp"%>
</head>

<body>
<div id="wrapper">

    <!-- Navigation -->
    <%@include file="../include/nav.jsp"%>

    <div id="page-wrapper">
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        快递公司管理<a a href="delivery/add.html" class="btn btn-primary btn-xs pull-right" role="button">新增记录</a>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>公司名称</th>
                                    <th>公司编码</th>
                                    <th>具体地址</th>
                                    <th>负责人姓名</th>
                                    <th>联系电话</th>
                                    <%--<th>接口地址</th>
                                    <th>接口帐号</th>
                                    <th>接口代码</th>
                                    <th>接口密码</th>--%>
                                    <th>创建时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${page.list}" var="item">
                                    <tr>
                                        <td>${item.id}</td>
                                        <td>${item.name}</td>
                                        <td>${item.code}</td>
                                        <td>${item.address}</td>
                                        <td>${item.director}</td>
                                        <td>${item.telephone}</td>
                                        <%--<td>${item.apiURL}</td>
                                        <td>${item.apiAccount}</td>
                                        <td>${item.apiCode}</td>
                                        <td>${item.apiPassword}</td>--%>
                                        <td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                                        <td><a href="/system/delivery/modify.html?id=${item.id}">编辑</a></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                        ${page}
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->
</div>

<%@include file="../include/footer.jsp"%>
</body>
</html>