/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.office.excel;

import java.util.List;

import com.feilong.test.AbstractTest;

/**
 * The Class AbstractLoxiaExcelWriteTest.
 */
public abstract class AbstractLoxiaReadTest extends AbstractTest{

    protected static <T> List<T> build(String xmlSheetConfigurations,String sheetName,String dataName,String fileName){
        return ExcelReaderUtil.getList(xmlSheetConfigurations, sheetName, dataName, fileName, 0);

    }

}