const topUpdateButton = document.getElementById('#top-update-btn');
const topDeleteButton = document.getElementById('top-delete-btn');


let isUpdateButtonActive = false;
let isDeleteButtonActive = false;

function revealOrHideUpdateSections() {
    let updateSectionList = document.querySelectorAll('#update-btn');
    if(!isUpdateButtonActive) {
        reveal(updateSectionList);
        isUpdateButtonActive = changeUpdateButtonStatus(isUpdateButtonActive);
        return;
    }
    hide(updateSectionList);
    isUpdateButtonActive = changeUpdateButtonStatus(isUpdateButtonActive);
}

function revealOrHideDeleteSections() {
    let deleteSectionList = document.querySelectorAll('#delete-btn');
    if(!isDeleteButtonActive) {
        reveal(deleteSectionList);
        isDeleteButtonActive = changeDeleteButtonStatus(isDeleteButtonActive);
        return;
    }
    hide(deleteSectionList);
    isDeleteButtonActive = changeDeleteButtonStatus(isDeleteButtonActive);
}


function reveal(sectionList) {
    sectionList.forEach(selection => (selection.style.display = "block"));
}

function hide(sectionList) {
    sectionList.forEach(selection => (selection.style.display = "none"));
}

function changeUpdateButtonStatus(isActive) {
    if(isActive){
        document.querySelector('#top-update-btn').style.color = '#191970';
        return isActive = false;
    } else {
        document.querySelector('#top-update-btn').style.color = '#1E90FF';
        return isActive = true;
    }
}

function changeDeleteButtonStatus(isActive) {
    if(isActive){
        document.querySelector('#top-delete-btn').style.color = '#191970';
        return isActive = false;
    } else {
        document.querySelector('#top-delete-btn').style.color = '#1E90FF';
        return isActive = true;
    }
}

topUpdateButton.addEventListener("click", revealOrHideUpdateSections);
topDeleteButton.addEventListener("click", revealOrHideDeleteSections);