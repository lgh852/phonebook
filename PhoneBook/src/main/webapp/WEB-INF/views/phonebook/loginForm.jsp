<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
   <script>

			
	$(document).ready(function(){
		$(loginForm).submit(function() {
			
			var id = $('#id').val();
			var password = $('#password').val();
			
			if(id.length < 1){
				alert('Id를 입력해주세요')
			}
			if(password.length < 1){
				alert('password를 입력해주세요')
			}
			
		});
	
	
		
	});

	
</script>
	
 <style>
    .textLeft {
        text-align: left;
        font-size: 30px;
   
    }

    .inputborder {
        
        height: 50px;
        font-size: 30px;
        
    }

    .marginTop{
        margin-top: 30px;
        margin-bottom: 30px;
    }

    .submit {
        margin-right: 20px;
        
    }
    .center{
    	margin: 0 auto;
    }

</style>
<body>
    <form id="loginForm" action="loginForm" method="post">
         
            <div class="form-group has-success ">
             <label class="control-label textLeft marginTop" for="mmbr_id" for="id">Id</label>
            <input type="text" name="mmbr_id" class="form-control inputborder" id="id">

            <label class="control-label textLeft marginTop submit" for="password">Password</label>
            <input type="password" name="mmbr_password" class="form-control inputborder" id="password">
            </div>
            
        
              <div class="input-group mb-3 center" >
			
            <input type="submit" value="login" class="btn btn-success submit marginTop">
            <input type="reset" class="btn btn-success marginTop">
          </div>
    </form>

</body>