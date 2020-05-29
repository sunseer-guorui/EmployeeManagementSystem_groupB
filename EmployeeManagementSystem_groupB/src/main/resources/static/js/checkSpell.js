function check_mail(){
	check_half(document.getElementById("mail"));
    var seiki = /[!#-9A-~]+@+[a-z0-9]+.+[^.]$/i;
    var mail = document.getElementsByName("user_mail")[0].value;
    if(mail.match(seiki)){
        // alert('メールアドレスは正しい');
        document.getElementById("mail_error").style.display="none";
        document.getElementById("flag").value = "true";
        // return true;
    }else{
        // alert('メールアドレスの形式が不正です');
        document.getElementById("mail_error").style.display="block";
        document.getElementById("flag").value = "false";
    }
}
function check_tele(){
	check_num(document.getElementById("tele"));
    var tele = document.getElementsByName("user_tele")[0].value;
    if(tele.length!==11){
        document.getElementById("tele_error").style.display="block";
        document.getElementById("flag").value = "false";
    }else{
        document.getElementsByName("user_tele")[0].value = tele.substring(0,3)+"-"+tele.substring(3,7)+"-"+tele.substring(7,12);
        document.getElementById("tele_error").style.display="none";
        document.getElementById("flag").value = "true";
    }

    if(tele.match(/^\d{3}-\d{4}-\d{4}$/)){
        document.getElementById("tele_error").style.display="none";
        document.getElementById("flag").value = "true";
    }
}


function check_firstname(nam){
    if(check_full(nam)==false){
        document.getElementById("name_error1").style.display="block";
        document.getElementById("flag").value = "false";
    }else{
        document.getElementById("name_error1").style.display="none";
        document.getElementById("flag").value = "true";
    }

}
function check_lastname(nam){
    if(check_full(nam)==false){
        document.getElementById("name_error2").style.display="block";
        document.getElementById("flag").value = "false";
    }else{
        document.getElementById("name_error2").style.display="none";
        document.getElementById("flag").value = "true";
    }

}

function $(id){
	return (document.getElementById(id));
}

function control_bubble(oEvent) {
//取消冒泡
oEvent = oEvent || window.event;
 if (document.all) {
 oEvent.cancelBubble = true;
 } else {
 oEvent.stopPropagation();
 }
}

window.onload = function() {
    document.onclick = function() {
    //隐藏层
		check_firstname(document.getElementById("firstname"));
		check_lastname(document.getElementById("lastname"));
		check_firstkata(document.getElementById("firstkata"));
		check_lastkata(document.getElementById("lastkata"));
		check_tele(document.getElementById("tele"));
		check_mail(document.getElementById("mail"));
    };
    $("firstname").onclick = control_bubble;
    $("lastname").onclick = control_bubble;
    $("firstkata").onclick = control_bubble;
    $("lastkata").onclick = control_bubble;
    $("tele").onclick = control_bubble;
    $("mail").onclick = control_bubble;

}

function check_firstkata(kat){
    if(check_kana(kat)==false){
        document.getElementById("name_error3").style.display="block";
        document.getElementById("flag").value = "false";
    }else{
        document.getElementById("name_error3").style.display="none";
        document.getElementById("flag").value = "true";
    }
}

function check_lastkata(kat){
    if(check_kana(kat)==false){
        document.getElementById("name_error4").style.display="block";
        document.getElementById("flag").value = "false";
    }else{
        document.getElementById("name_error4").style.display="none";
        document.getElementById("flag").value = "true";
    }
}



function check_full(full){
    if(!full.value.match(/^[^\x01-\x7E\uFF61-\uFF9F]+$/)){
        return false;
    }
}

function check_kana(kat){
    if(!kat.value.match(/^[\u30a1-\u30f6]+$/)){
        return false;
    }
}

function check_half(half){
    if(half.value.match(/[０-９Ａ-Ｚａ-ｚ]/g)){
        half.value = half.value.replace( /[０-９Ａ-Ｚａ-ｚ]/g, function(es) {
            return String.fromCharCode(es.charCodeAt(0) - 65248);
         });
    }
}

function check_num(num){
    if (num.value.match(/[０-９－]/g)){
        num.value = num.value.replace( /[０-９－]/g, function(es) {
            return String.fromCharCode(es.charCodeAt(0) - 65248);
         });
    }
    if(!num.value.match(/[0-9]/g)){
        return false;
    }
}

function check_flag(){
	var flag = document.getElementById("flag").value;
	if(flag == "true"){
		document.getElementById("submit").type="submit";

	}
}