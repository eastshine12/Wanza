$.fn.filterSelect = function () {
	function t() {
		return s.isShow() || o.hasClass("open")
	}
	if (1 < $(this).length) $(this).each(function (e) {
		$(e).filterSelect()
	});
	else {
		var i = $(this),
			e = i.children(".filter-select__header"),
			o = i.children(".filter-select__list"),
			n = $(document.getElementById($(this).data("modal-id"))),
			s = n.modal();
		$(document).on("click", function (e) {
			i.find(e.target).exists() || n.find(e.target).exists() || !t() || (o.removeClass("open"), s.hide(), e.preventDefault())
		}), e.on("click", function (e) {
			e.stopPropagation(), t() ? (o.removeClass("open"), s.hide()) : window.matchMedia("(max-width: 767px)").matches ? s.show() : o.addClass("open")
		})
	}
}, $(function () {
	$(".filter-select").filterSelect()
}), $(function () {
	var e = $("#scroll_to_top");
	e.hide(), $(document).scroll(function () {
		100 < $(document).scrollTop() ? $("#scroll_to_top").show() : $("#scroll_to_top").hide()
	}), e.click(function () {
		$("html, body").animate({
			scrollTop: 0
		}, 300)
	})
}), $(function () {
	$("#questions-filter").sticky(getTopOffset);
	var t = $("#questions-header__keywords__fold .sticky-bottom").sticky(0, {
		bottom: !0
	});
	$("#questions-header__keywords__toggle").change(function (e) {
		e.target.checked || $("html, body").stop().animate({
			scrollTop: 0
		}, 200, "swing"), setTimeout(t.update.bind(t), 200)
	})
}), $(function () {
	var e = $(".questions-header__form__search>.clear"),
		t = $("#questions-header__form__search"),
		i = $("#questions-header__form"),
		o = function () {
			t.val() ? e.show() : e.hide()
		};
	t.on("keydown keyup keypress change", o), o(), e.on("click", function () {
		t.val(""), e.hide(), i.submit()
	}), t.autocomplete({
		data: $(".questions-header__keywords__all .keyword-item").toArray().map(function (e) {
			return $(e).text().trim()
		}),
		onSelect: function (e) {
			t.val(e), i.submit()
		}
	})
}), $(function () {
	var o = $("#questions-header__form__search"),
		n = $("#questions-header__form");
	$(".keyword-item").click(function (e) {
		e.preventDefault();
		var t = o.val().trim().split(/\s+/g).filter(function (e) {
				return "" !== e
			}),
			i = $(this).text(); - 1 === t.indexOf(i) && (null != window.amplitude && window.amplitude.logEvent("\ucee8\ud150\uce20 \ub9ac\uc2a4\ud2b8 Viewed", {
			contents_list_type: "\uc9c8\ubb38\uacfc\ub2f5\ubcc0"
		}), o.val(i).change(), n.submit())
	})
}), $(function () {
	$("#questions-paginator .paginator").paginator({
		skip: !0,
		getPageURL: function (e, t) {
			var i = "/questions";
			for (var o in t) t.hasOwnProperty(o) && (i = replaceQueryString(i, o, t[o]));
			return i = replaceQueryString(i, "page", e)
		},
		ajax: !1,
		queries: location.search.slice(1).split("&").map(function (e) {
			return e.split("=")
		}).reduce(function (e, t) {
			return e[t[0]] = t[1], e
		}, {})
	})
}), $(function () {
	var e = $("#questions-header__form__search");
	"" !== e.val() && window.matchMedia("(max-width: 767px)").matches && $("html, body").scrollTop(e.offset().top - 15), "#search" === location.hash && e.focus(), $(window).on("hashchange", function () {
		"#search" === location.hash && (e.focus(), $("#mobile_slide_background").click())
	})
}), $(function () {
	var t = $("#modal-question-write").modal();
	$(".questions-filter__actions__new-question").click(function (e) {
		e.preventDefault(), t.show()
	})
}), $(function () {
	$(".questions-advice-list__scroller").each(function () {
		function i() {
			var e = $(n[0]).outerWidth(),
				t = Math.round(o.scrollLeft() / e) * e;
			s.toggleClass("scroller--hide", 0 === t), l.toggleClass("scroller--hide", t + o.width() >= n.length * e - 50)
		}
		var e = $(this);
		if (!("ontouchstart" in window || navigator.maxTouchPoints)) {
			e.addClass("scroller--enable");
			var o = e.find(".questions-advice-list__scroller__content"),
				n = e.find(".questions-advice-list__item-wrap"),
				s = e.find(".questions-advice-list__scroller__ui__left"),
				l = e.find(".questions-advice-list__scroller__ui__right");
			i(), s.click(function () {
				if (!s.hasClass("scroller--hide")) {
					var e = $(n[0]).outerWidth(),
						t = (Math.round(o.scrollLeft() / e) - 1) * e;
					o.stop().animate({
						scrollLeft: t
					}, 200, i)
				}
			}), l.click(function () {
				if (!l.hasClass("scroller--hide")) {
					var e = $(n[0]).outerWidth(),
						t = (Math.round(o.scrollLeft() / e) + 1) * e;
					o.stop().animate({
						scrollLeft: t
					}, 200, i)
				}
			})
		}
	})
}), $(function () {
	$(".questions-item__link").click(function () {
		var e = $(this),
			t = /^\/questions\/(\d+)/.exec(e.attr("href"));
		if (null != t) {
			var i = parseInt(t[1], 10),
				o = $(".questions-item__link").index(e),
				n = /reply=not_yet/.test(location.search);
			null != window.amplitude && window.amplitude.logEvent("\ucee8\ud150\uce20 Viewed", {
				contents_type: "\uc9c8\ubb38\uacfc\ub2f5\ubcc0",
				contents_id: i,
				source: {
					page: {
						tab: {
							main: "\ud648",
							sub: "\uc9c8\ubb38\uacfc\ub2f5\ubcc0"
						}
					},
					referrer: {
						type: "\ucee8\ud150\uce20 \ub9ac\uc2a4\ud2b8",
						position: o + 1
					},
					is_filtered: n,
					filter_type: {
						"\ub313\uae00\uc744 \uae30\ub2e4\ub9ac\ub294 \uc9c8\ubb38": n
					}
				}
			})
		}
	}), null != window.amplitude && window.amplitude.logEvent("\ucee8\ud150\uce20 \ub9ac\uc2a4\ud2b8 Viewed", {
		contents_list_type: "\uc9c8\ubb38\uacfc\ub2f5\ubcc0"
	})
});