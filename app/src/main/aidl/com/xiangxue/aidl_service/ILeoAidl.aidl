// ILeoAidl.aidl
package com.xiangxue.aidl_service;

// Declare any non-default types here with import statements

import com.xiangxue.aidl_service.Person;

interface ILeoAidl {
    void addPerson(in Person person);

    List<Person> getPersonList();
}
