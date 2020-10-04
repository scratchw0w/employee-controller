let isUpdateButtonActive = false;
let isDeleteButtonActive = false;

function revealOrHideUpdateSections() {
    let updateSectionList = document.querySelectorAll('#update');
    if(!isUpdateButtonActive) {
        reveal(updateSectionList);
        isUpdateButtonActive = true;
        return;
    }
    hide(updateSectionList);
    isUpdateButtonActive = false;
}

function revealOrHideDeleteSections() {
    let deleteSectionList = document.querySelectorAll('#delete');
    if(!isDeleteButtonActive) {
        reveal(deleteSectionList);
        isDeleteButtonActive = true;
        return;
    }
    hide(deleteSectionList);
    isDeleteButtonActive = false;
}


function reveal(sectionList) {
    sectionList.forEach(selection => (selection.style.display = "block"));
}

function hide(sectionList) {
    sectionList.forEach(selection => (selection.style.display = "none"));
}