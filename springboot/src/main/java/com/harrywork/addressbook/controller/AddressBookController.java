package com.harrywork.addressbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class AddressBookController {

    @RequestMapping("/list")
    public String listAddresses() {
        return
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>my Address Book</title>\n" +
                        "</head>\n" +
                        "\n" +
                        "<script>\n" +
                        "    function add() {\n" +
                        "        var table = document.getElementById(\"addressbook\");\n" +
                        "        var row = table.insertRow(-1);\n" +
                        "        var cell1 = row.insertCell();\n" +
                        "        cell1.innerHTML = \"name\";\n" +
                        "        var cell2 = row.insertCell();\n" +
                        "        cell2.innerHTML = \"Company\";\n" +
                        "        var cell3 = row.insertCell();\n" +
                        "        cell3.innerHTML = \"Phone\";\n" +
                        "        var cell4 = row.insertCell();\n" +
                        "        cell4.innerHTML = \"<input type='button' value='Delete'>\";\n" +
                        "\n" +
                        "    }\n" +
                        "</script>\n" +
                        "<body>\n" +
                        "<h1>This is my address book.</h1>\n" +
                        "<hr/>\n" +
                        "<button onclick=\"add()\">New Contact</button>\n" +
                        "<table id=\"addressbook\">\n" +
                        "    <tr>\n" +
                        "        <th>Name</th>\n" +
                        "        <th>Company</th>\n" +
                        "        <th>Telephone</th>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td contenteditable=true>Alfreds Futterkiste</td>\n" +
                        "        <td>Maria Anders</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td contenteditable=false>Centro comercial Moctezuma</td>\n" +
                        "        <td>Francisco Chang</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>Ernst Handel</td>\n" +
                        "        <td>Roland Mendel</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>Island Trading</td>\n" +
                        "        <td>Helen Bennett</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "\n" +
                        "    <tr>\n" +
                        "        <td>Laughing Bacchus Winecellars</td>\n" +
                        "        <td>Yoshi Tannamuri</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>Magazzini Alimentari Riuniti</td>\n" +
                        "        <td>Giovanni Rovelli</td>\n" +
                        "        <td>416-111-1111</td>\n" +
                        "        <td><input type=\"button\" value=\"Delete\"></td>\n" +
                        "\n" +
                        "    </tr>\n" +
                        "</table>\n" +
                        "<form method=\"post\" action=\"/list\" enctype=\"application/x-www-form-urlencoded\">\n" +
                        "    <p>Name:<input type=\"text\" name=\"name\"/></p>\n" +
                        "    <p>Company:<input type=\"text\" name=\"company\"/></p>\n" +
                        "    <p>Telephone:<input type=\"text\" name=\"telephone\"/></p>\n" +
                        "    <p><input type=\"submit\" value=\"Add Item\"/></p>\n" +
                        "</form>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n";
    }
}
