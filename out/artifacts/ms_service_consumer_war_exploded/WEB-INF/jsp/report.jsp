<%--
  Created by IntelliJ IDEA.
  User: Jason
  Date: 2019/2/7
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <title>Title</title>
 <script type="text/javascript" src="http://localhost:8081/decision/view/report?op=emb&resource=finereport.js"></script>
 <script language="javascript">
  function autoLoad(){
   var addr = encodeURI("http://localhost:8081/decision/view/report?viewlet=dc_report/NonClearAlarm.cpt&区域=清华研究院&设备类型=动环监控&告警类型=系统告警&告警级别=2&__pi__=false");
   document.getElementById("reportFrame").src = addr;
  }
  window.onload = autoLoad;
 </script>
</head>
<body>
Home Page<br>
<iframe id="reportFrame" width="900" height="800" ></iframe>
<script type="text/javascript">
 var url="http://localhost:8080/decision/view/report?viewlet=GettingStarted.cpt&地区=华北";
 var isPopUp = true;
 var config = {url : url,isPopUp : isPopUp}
 FR.doprint(config);
</script>
</body>
</html>
