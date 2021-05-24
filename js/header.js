
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

// 검색 아이콘 클릭시
$(document).on('click', '#fafafa', function () {
    if($("#headerSearch").val()==""){

        document.getElementById("headerSearch").setAttribute()

        $("#headerSearch").attr('value', $("headerSearch").attr('placeholder'))
        alert($("#headerSearch").val());



    }else{/* 
        $.ajax({
            url:"http://192.168.0.231:3000/searchWrite",
            type:"get",
            data:{searchWord:$} */
            alert($("#headerSearch").val());
            

    }

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
    
});

