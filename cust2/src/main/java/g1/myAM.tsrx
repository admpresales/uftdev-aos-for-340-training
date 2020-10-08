<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>myAM</className>
    <objects>
        <object type="Link" technology="Web">
            <name>ShoppingCart</name>
            <codeName>ShoppingCartLinkRon</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="AccessibilityName" type="string" isRegExp="false">ShoppingCart</property>
                    <property name="InnerText" type="string" isRegExp="true">\d</property>
                    <property name="Role" type="string" isRegExp="false">link</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>check_out_btn</name>
            <codeName>CheckOutBtnButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="true">CHECKOUT.*</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
                <index>0</index>
            </identification>
        </object>
    </objects>
</applicationModel>
