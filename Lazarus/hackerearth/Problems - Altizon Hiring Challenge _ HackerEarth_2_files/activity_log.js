$(document).ready(function(){function a(a){var b=$("#activity-log-url").text(),c=$.ajax({url:b,type:"POST",data:{action:a},success:function(a){}})}$(window).focus(function(){a("focused")}),$(window).blur(function(){a("blurred")})});