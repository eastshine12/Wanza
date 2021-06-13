
$(document).ready(function() {
    includeHTML();
    
    //주소값 확인
    let href = document.location.href.split('/');
    let href1 = href[href.length-1];

    //메뉴 활성화
    let title = href1.substr(0,5);
    if(title=='store' || title=='commu'){
        //메뉴 초기화
        $('.menu_header, .menu_sub li').removeClass('active');
        $('#menu_store, #menu_comt').removeClass('show');
        
        if(title=='store'){
            $('.menu_header:eq(0)').addClass('active');
            $('#menu_store').addClass('show');
        }
        else if(title=='commu'){
            $('.menu_header:eq(1)').addClass('active');
            $('#menu_comt').addClass('show');
        }
    }

    //서브메뉴 활성화
    let sTitle = href1.substring(href1.indexOf('-')+1,href1.indexOf('.html'));
    if(sTitle=='deliveryStatus'){ $('.menu_sub li:eq(0)').addClass('active'); };
    if(sTitle=='salesStatus')   { $('.menu_sub li:eq(1)').addClass('active'); };
    if(sTitle=='addProduct')    { $('.menu_sub li:eq(2)').addClass('active'); };
    if(sTitle=='productAnswer') { $('.menu_sub li:eq(3)').addClass('active'); };
    if(sTitle==''){ $('.menu_sub li:eq(4)').addClass('active'); };
    if(sTitle=='storyTag')      { $('.menu_sub li:eq(5)').addClass('active'); };
    if(sTitle==''){ $('.menu_sub li:eq(6)').addClass('active'); };
    if(sTitle==''){ $('.menu_sub li:eq(7)').addClass('active'); };

    
    $('.menu_header').click( function() { //사이드 메뉴 활성화
        $('.menu_header').removeClass('active')
        $(this).addClass('active');
    });

    $('.menu_sub li').click( function() { //사이드 서브메뉴 활성화
        $('.menu_sub li').removeClass('active')
        $(this).addClass('active');
    });

    $('.navbar-toggler').click( function() { //사이드 토글
        $('.sidebar').addClass('side_open')
    });

});