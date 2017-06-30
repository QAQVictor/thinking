function checkSel() {
	var chks = document.getElementsByName("chk");
	for (i = 0; i < chks.length; i++) {
		if (chks[i].checked) {
			chks[i].checked = "";
		} else {
			chks[i].checked = "checked";
		}
	}
}