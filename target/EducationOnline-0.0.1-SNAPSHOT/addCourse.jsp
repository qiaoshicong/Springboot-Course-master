<%@ page import="cn.wxj.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <title>新课程信息</title>
    <style>
        body {
            padding-top: 100px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        form {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">学生在线教学平台系统</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/adminIndex">主页</a></li>
                <li ><a href="${pageContext.request.contextPath}/studentManage">学生管理</a></li>
                <li class="active"><a href="/courseManage">课程管理</a></li>
                <li><a href="${pageContext.request.contextPath}/chooseManage">选课管理</a> </li>
                <li><a href="${pageContext.request.contextPath}/index">返回学生版主页</a></li>
            </ul>
        </div><!--/.nav-collapse -->

    </div>
</nav>

<div class="container">
    <form action="${pageContext.request.contextPath}/addCourse" method="post" enctype="multipart/form-data">
        <h3>新课程信息</h3>
        <div class="form-group">
            <label for="name">课程图片</label>
            <input type="file" class="form-control" id="file" name="file" placeholder="课程图片" value="" required>
        </div>
        <div class="form-group">
            <label for="name">课程名</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="课程名" required>
        </div>
        <div class="form-group">
            <label for="time">开课学期</label>
            <input type="text" class="form-control" id="time" name="time" placeholder="开课学期" required>
        </div>
        <div class="form-group">
            <label for="credit">课程学分</label>
            <input type="text" class="form-control" id="credit" name="credit" placeholder="课程学分" required>
        </div>
        <div class="form-group">
            <label for="belong">授课老师</label>
            <input type="text" class="form-control" id="belong" name="belong" placeholder="所属授课老师" required>
        </div>
        <div class="form-group">
            <label for="place">开课地点</label>
            <input type="text" class="form-control" id="place" name="place" placeholder="开课地点" required>
        </div>
        <div class="form-group">
            <label for="amount">课程容量</label>
            <input type="text" class="form-control" id="amount" name="amount" placeholder="课程容量" required>
        </div>
        <div class="form-group">
            <label for="detail">课程描述</label>
            <input type="text" class="form-control" id="detail" name="detail" placeholder="课程描述" required>
        </div>
        <button type="submit" class="btn btn-success">提交</button>
        <a href="${pageContext.request.contextPath}/courseManage" class="btn btn-default">返回</a>
    </form>
</div>
</body>
</html>
