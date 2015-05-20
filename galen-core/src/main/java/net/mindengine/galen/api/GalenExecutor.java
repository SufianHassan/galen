/*******************************************************************************
* Copyright 2015 Ivan Shubin http://mindengine.net
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
******************************************************************************/
package net.mindengine.galen.api;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import net.mindengine.galen.utils.TestDevice;

/**
 * Java API for Galen layout testing. Will be injected to interact with Galen
 * 
 * @author mreinhardt
 *
 */
public interface GalenExecutor {

    /**
     * Check the layout of a page for the given url, device and specs
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param specs
     *            specs to use for validating
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, List<String> specs) throws Exception;

    /**
     * Check the layout of a page for the given url, device and specs
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param specs
     *            specs to use for validating
     * @param includedTags
     *            explicit list of tags to test against, if null tags of the used device are used
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, List<String> specs, List<String> includedTags) throws Exception;

    /**
     * Check the layout of a page for the given url, device and specs
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param specs
     *            specs to use for validating
     * @param includedTags
     *            explicit list of tags to test against, if null tags of the used device are used
     * @param groups
     *            to show in the report
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, List<String> specs, List<String> includedTags, List<String> groups) throws Exception;

    /**
     * Check the layout of a page for the given url, device and spec
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param spec
     *            spec to use for validating
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, String spec) throws Exception;

    /**
     * Check the layout of a page for the given url, device and spec
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param specs
     *            spec to use for validating
     * @param includedTags
     *            explicit list of tags to test against, if null tags of the used device are used
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, String spec, List<String> includedTags) throws Exception;

    /**
     * Check the layout of a page for the given url, device and spec
     * 
     * @param testDevice
     *            device to test against
     * @param url
     *            page to load
     * @param spec
     *            spec to use for validating
     * @param includedTags
     *            explicit list of tags to test against, if null tags of the used device are used
     * @param groups
     *            to show in the report
     * @throws Exception
     *             in case of any errors
     */
    void checkLayout(TestDevice testDevice, String url, String spec, List<String> includedTags, List<String> groups) throws Exception;

    /**
     * Get the current used driver instance
     * 
     * @return current instance
     * @throws MalformedURLException
     */
    WebDriver getDriverInstance() throws MalformedURLException;

    /**
     * Create a WebDriver instance
     * 
     * @return the created driver instance
     * @throws MalformedURLException
     */
    abstract WebDriver createDriver() throws MalformedURLException;

    /**
     * Closes the current driver instance
     * 
     */
    void quitDriver();
}