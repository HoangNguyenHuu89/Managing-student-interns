
function editEmployee() {
    document.getElementById('id').removeAttribute('disabled');
    document.getElementById('universityId').removeAttribute('readonly');
    document.getElementById('birthday').removeAttribute('readonly');
    document.getElementById('scholastic').removeAttribute('readonly');
    document.getElementById('indentiftCard').removeAttribute('readonly');
    document.getElementById('mentorId').removeAttribute('readonly');
    document.getElementById('companyCardId').removeAttribute('readonly');
    document.getElementById('positionId').removeAttribute('readonly');
    document.getElementById('status').removeAttribute('readonly');
    document.getElementById('level').removeAttribute('readonly');
    document.getElementById('memo').removeAttribute('readonly');
 
    document.getElementById('employee_view_btn_text').innerText = "Cancel";

    document.getElementById('employee_update_text').innerText = "Update Employee";

    document.getElementById('employee_cancel_edit').removeAttribute('hidden');

}

function editTimesheet() {
    document.getElementById('intershipId').removeAttribute('disabled');
    document.getElementById('workingDay').removeAttribute('readonly');
    document.getElementById('time').removeAttribute('readonly');
    document.getElementById('createdId').removeAttribute('disabled');
    document.getElementById('createdAt').removeAttribute('disabled');
    document.getElementById('modifiedId').removeAttribute('readonly');
    document.getElementById('modifiedAt').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Cancel";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editReview() {
    document.getElementById('id').removeAttribute('disabled');
    document.getElementById('type').removeAttribute('readonly');
    document.getElementById('reviewId').removeAttribute('readonly');
    document.getElementById('objectId').removeAttribute('readonly');
    document.getElementById('rank').removeAttribute('readonly');
    document.getElementById('content').removeAttribute('readonly');
    document.getElementById('createdId').removeAttribute('disabled');
    document.getElementById('createdAt').removeAttribute('disabled');
    document.getElementById('modifiedId').removeAttribute('readonly');
    document.getElementById('modifiedAt').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Cancel";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editUniversity() {
    document.getElementById('name').removeAttribute('readonly');
    document.getElementById('createdId').removeAttribute('disabled');
    document.getElementById('createdAt').removeAttribute('disabled');
    document.getElementById('modifiedId').removeAttribute('readonly');
    document.getElementById('modifiedAt').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Cancel";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editCompanyCard() {
    document.getElementById('id').removeAttribute('readonly');
    document.getElementById('createdId').removeAttribute('disabled');
    document.getElementById('createdAt').removeAttribute('disabled');
    document.getElementById('modifiedId').removeAttribute('readonly');
    document.getElementById('modifiedAt').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Cancel";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editPosition() {
    document.getElementById('name').removeAttribute('readonly');
    document.getElementById('createdId').removeAttribute('disabled');
    document.getElementById('createdAt').removeAttribute('disabled');
    document.getElementById('modifiedId').removeAttribute('readonly');
    document.getElementById('modifiedAt').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Cancel";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editDepartment() {
    document.getElementById('id').removeAttribute('disabled');
    document.getElementById('maxIntership').removeAttribute('readonly');
    document.getElementById('isAcitveFlg').removeAttribute('readonly');
 
    document.getElementById('department_view_btn_text').innerText = "Cancel";

    document.getElementById('department_update_text').innerText = "Update Department";

    document.getElementById('department_cancel_edit').removeAttribute('hidden');

}

function editEmployeeAdminProfile() {
    document.getElementById('employee_admin_username').removeAttribute('readonly');
    document.getElementById('employee_admin_first_name').removeAttribute('readonly');
    document.getElementById('employee_admin_last_name').removeAttribute('readonly');
    document.getElementById('employee_admin_email').removeAttribute('readonly');
    document.getElementById('employee_admin_gender').removeAttribute('disabled');
    document.getElementById('employee_admin_phoneNo').removeAttribute('readonly');
    document.getElementById('employee_admin_birthday').removeAttribute('readonly');
    document.getElementById('employee_admin_nic').removeAttribute('readonly');
    document.getElementById('employee_admin_address').removeAttribute('readonly');
    document.getElementById('employee_admin_current_password').removeAttribute('readonly');
    document.getElementById('employee_admin_new_password').removeAttribute('readonly');
    document.getElementById('employee_admin_confirm_new_password').removeAttribute('readonly');
 
    document.getElementById('normal_employee_view_btn_text').innerText = "Save";

    document.getElementById('normal_employee_cancel_edit').removeAttribute('hidden');

}
