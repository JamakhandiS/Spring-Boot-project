/**
 * 
 */
function generatePassword(firstName, middleName, lastName) {
  const firstCharFirstName = firstName.charAt(0);
  const lastCharFirstName = firstName.charAt(firstName.length - 1);
  const firstCharMiddleName = middleName.charAt(0);
  const lastCharMiddleName = middleName.charAt(middleName.length - 1);
  const firstCharLastName = lastName.charAt(0);
  const lastCharLastName = lastName.charAt(lastName.length - 1);
  const randomNum = Math.floor(Math.random() * 900) + 100;

  return firstCharFirstName + lastCharFirstName + firstCharMiddleName + lastCharMiddleName + firstCharLastName + lastCharLastName + randomNum;
}