(function(g){if(g._errs&&_errs.shift){var v="https:"==location.protocol,k="http"+(v?"s":"")+"://p.errorception.com/projects/"+_errs.shift()+"/err",C="<form method='post' action='"+k+"'>",l=[],w="before",x=document.getElementsByTagName("script")[0],r=Array.prototype.slice,D=navigator.userAgent,t,m=function(a,c){for(var b in a)a.hasOwnProperty(b)&&c(b,a[b])},y=function(a){return function(c,b){b&&(a[c]=b)}},z=function(a,c){for(var b=0,d=a.length;b<d;b++)c(a[b],b)},A=function(){try{console.log.apply(console,arguments)}catch(a){}},E=function(){var a=document.createElement("iframe");a.style.display="none";x.parentNode.insertBefore(a,x);setTimeout(function(){a.parentNode.removeChild(a)},1E4);var c=a.contentWindow||a.contentDocument;return c.document||c},G=function(a){var c=C;z(a,function(a,d){m(a,function(e,F){if("meta"!==e)c+=n(e+d,F);else{var h=0;m(a.meta,function(a,b){c+=n("meta"+d+"name"+h,a);c+=n("meta"+d+"value"+h,b);h++})}})});return c+"</form><script>onload=function(){setTimeout(function(){document.forms[0].submit()},10);}\x3c/script>"},n=function(a,c){return"<textarea name="+a+">"+(""+c).replace(/</g,"&lt;")+"</textarea>"},H=function(a,c){var b;g.XMLHttpRequest&&"withCredentials"in new XMLHttpRequest?(b=new XMLHttpRequest,b.open("post",k,!0),b.setRequestHeader("Content-Type","text/plain")):g.XDomainRequest&&(b=new XDomainRequest,b.open("POST",k));if(b&&g.JSON)b.onload=function(){c&&200==b.status&&parseInt(b.responseText)&&c(b.responseText)},b.send(JSON.stringify(a));else{var d=E();d.open();d.write(G(a));d.close()}},I=function(a){if(a._allow)return!0;if(_errs.allow&&_errs.allow.constructor&&_errs.allow.call&&_errs.allow.apply){var c={};z(["message","url","line","stack"],function(b){var d=a[b];d&&(c[b]=d)});try{return _errs.allow(c)}catch(b){b._allow=!0;var d=_errs.meta;_errs.meta={"Original message":a.message,"Original line number":a.line,"Original script url":a.url,"Original stack":a.stack};u(b);_errs.meta=d}}return!0},J=function(){if(_errs.meta){var a;m(_errs.meta,function(c,b){/string|number|boolean/.test(typeof b)&&(a=a||{},a[c]=b)});return a}},K=function(){for(var a=[],c;c=l.shift();){a.push(c);if(l.length&&"2"==c.method){var b=l.shift();"2"!=c.method||"2"===b.method||-1==b.message.indexOf(c.message)&&-1==c.message.indexOf(b.message)?l.unshift(b):!c.line&&b.line&&(c.line=b.line)}c.line||c.stack||a.pop()}return a},u=function(a){if(!p){t&&clearTimeout(t);try{var c;if(a){var b;a.m?b={message:a.m,url:a.u,line:a.l,method:"0"}:a.length?(b={message:a[0],url:a[1],line:a[2],method:"1"},m({column:a[3],stack:a[4]&&a[4].stack?a[4].stack:a.stacktrace||a.stack,number:a.number},y(b))):a instanceof Error&&(b={message:a.name+": "+a.message,method:"2"},m({url:a.fileName||a.sourceURL,line:a.line||a.lineNumber,column:a.columnNumber,stack:a.stacktrace||a.stack,number:a.number,_allow:a._allow},y(b)));c=b}else c=void 0;if(!c)return;c.when=w;c.page=location.href;if(!c.stack&&a.callee&&a.callee.caller&&a.callee.caller.caller){var d,e=a.callee.caller;a=/function\s*([\w\-$]+)?\s*\(/i;b=[];for(var f;e&&e.arguments&&10>b.length;)f=a.test(e.toString())?RegExp.$1||"{anonymous}":"{anonymous}",b.push(f+"("+(v?"":q(r.call(e.arguments||[])))+")"),e=e.caller;(d=1<b.length?b.join("\n"):"")&&(c.stack=d)}var h;d=c;if(h=!("Error loading script"==d.message&&/Firefox/.test(D)||!d.message||0==d.line||d.url&&0===d.url.split("#")[0].indexOf(location.href.split("#")[0])&&1==d.line||"script error."==d.message.toLowerCase()||/originalCreateNotification/.test(d.message)||/atomicFindClose/.test(d.message)||d.url&&-1!==d.url.indexOf("fb.commercetopics.com")||/jid1\-ejhbjdxm9zr4tq/.test(d.url)||"miscellaneous_bindings"==d.url)&&I(c)){var g;g=c.stack&&1E4<c.stack.length?!0:!1;h=!g}if(h){var k=J();k&&(c.meta=k);l.push(c)}}catch(n){}t=setTimeout(L,200)}},p=!1,L=function(){if(!p)try{var a=K();a.length&&(50<a.length&&(p=!0,a=a.slice(0,50)),H(a,function(a){A("Posted "+a+" error"+(1==a?"":"s")+" to errorception.com");p&&A("Errorception disabled due to flooding")}))}catch(c){}},q=function(a){for(var c=[],b=0;b<a.length;++b){var d=a[b];void 0===d||null===d?c[b]=""+d:d.constructor&&(d.constructor==Array?c[b]=3>d.length?"["+q(d)+"]":"["+q(r.call(d,0,1))+"..."+q(r.call(d,-1))+"]":d.constructor==Object?c[b]="#object":d.constructor==Function?c[b]="#function":d.constructor==String?c[b]='"'+d+'"':d.constructor==Number&&(c[b]=d))}return c.join()},f;for(;f=_errs.shift();)u(f);w="after";f=_errs.meta;var B=_errs.allow;_errs={push:u};f&&(_errs.meta=f);B&&(_errs.allow=B)}})(window);