
includeHTML();


// 상단 배너 X 클릭 삭제
$(document).on('click', '#closeBanner', function() {
    $('#_card').hide();
})

// 로고 클릭 -> 메인화면 이동
$(document).on('click', '#_logo', function () {
    location.href = '../../index.html';
})

$(document).on('click', '#goCommunity', function () {
    alert('커뮤이동');
})

$(document).on('click', '#goStore', function () {
    alert('스토어이동');
})


$(document).on('click', '#goCart', function () {
    location.href = "../store/cart.html";
})

/*
$(document).on('mouseover', '#_realTime', function () {

    alert('마우스오버');

})

$(document).on('mouseleave', '#_realTime', function () {
    alert('마우스나감');
})
*/


$(document).on('click', '#goLogin', function () {
    location.href = "../login/login.html"
})

$(document).on('attr', '#headerSearch', function () {
    location.href = "../login/login.html"
})

// 검색 아이콘 클릭시 검색어 DB저장
$(document).on('click', '#search-icon', function () {
    // 검색어가 없는경우 placeholder값으로 입력
    if($("#headerSearch").val()==""){
        document.getElementById("headerSearch").setAttribute("value",$("#headerSearch").attr('placeholder'))
    }
        $.ajax({
            url:"http://localhost:3000/searchWrite",
            type:"get",
            data:{searchWord:$("#headerSearch").val()},
            success:function(data) {
                if(data=="suc"){
                    //alert("검색어등록성공");
                }else{
                    //alert("검색어등록실패");
                }
            },
            error:function(){
                //alert("검색error");
            }
        })
})





$(document).ready(function() {

    // 세션 아이디 정보 가져오기
    let sessionId = sessionStorage.getItem("login");
    if (sessionId != null) {
        $('#goLogin').html('<b>내 정보</b>')
    }


    // 실시간 검색어 슬라이드
    function tick() {
        $('#_realTime li:first').slideUp(function () {
            $(this).appendTo($('#_realTime')).slideDown();
        }
        )
    };

    // 실시간 검색어 2초마다 변경
    setInterval(function () {tick()}, 2000);



    // 이벤트 검색어 랜덤 추출 (가끔 null값이 떠서 출력이 안됨)
    let eventSearchText = new Array(
        '여름 특별 세일', '모션데스크&책장 함께 드려요',
        '슬기로운 집콕생활', '데스커 모션데스크', '왜가끔안뜰까')
    function randomItem(item) {
        return item[Math.floor(Math.random() * item.length)];
    };
    let choiceText = randomItem(eventSearchText);
    console.log(choiceText);
    document.getElementById('headerSearch').setAttribute('placeholder', choiceText);

    // 실시간 검색순위 리스트
    getSearchList();
    function getSearchList(){
        $.ajax({
            url:"http://localhost:3000/getSearchWord",
            type:"get",
            success:function(list){
                
                let app="";
                let app2="";

                let today = new Date()
                let year = today.getFullYear()   // 년
                let month = today.getMonth()+1   // 월
                let date = today.getDate();      // 날짜
                let hours = today.getHours();    // 시
                let minutes = today.getMinutes();  // 분

                if(hours<10){
                    hours = "0"+hours;
                }

                if(minutes<10){
                    minutes = "0"+minutes;
                }

                app2 ="<div id='searchChart'>"
                    +"<table>"
                    +"<colgroup>"
                    +"<col width='160px'><col width='160px'>"
                    +"</colgroup>"
                    +"<tr>"
                    +"<th>실시간 인기 검색어</th>"
                    +"<td>"+year+"."+month+"."+date+" "+hours+":"+minutes+"기준"+"</td>"
                    +"</tr>"

                $.each(list,function(i,val){                 
                    app += "<li><b>"+(i+1)+"</b> &emsp;<a href='#' style='color: black;'>"+val.searchWord+"</a></li>";
                    app2 += "<tr>"
                        +"<td colspan='2'><a href='#'><b>"+(i+1)+"</b>. "+val.searchWord+"</a></td>"
                        +"</tr>";

                });
                $("#_realTime").append(app);
                app2 += "</table>"
                     +"</div>";
                $("#hotIssue").after(app2);
                
            },
            error:function(){
                //alert('검색순위 error')
            }
        })
    }
    
    $("#_realTime").mouseenter(function(){
        $("#searchChart").show();
    });

    $("#searchChart").mouseleave(function(){
        $("#searchChart").hide();
       
    });

   

    





});

