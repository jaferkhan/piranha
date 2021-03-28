/*
 * Copyright (c) 2002-2021 Manorrock.com. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the name of the copyright holder nor the names of its
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package cloud.piranha.http.api;

import java.io.InputStream;
import java.util.Iterator;

/**
 * The HttpServerRequest API.
 *
 * <p>
 * See https://tools.ietf.org/html/rfc7230 for more information.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public interface HttpServerRequest {

    /**
     * Get the header.
     *
     * @param name the name of the header.
     * @return the value, or null.
     */
    String getHeader(String name);

    /**
     * {@return the header names}
     */
    Iterator<String> getHeaderNames();

    /**
     * Get the headers.
     *
     * @param name the name of the header.
     * @return the potentially empty collection.
     */
    Iterator<String> getHeaders(String name);

    /**
     * {@return the HTTP version}
     */
    default String getHttpVersion() {
        return "HTTP/1.1";
    }

    /**
     * {@return the local address}
     */
    String getLocalAddress();

    /**
     * {@return the local hostname}
     */
    String getLocalHostname();

    /**
     * {@return the local port}
     */
    int getLocalPort();

    /**
     * Get the message body as an input stream.
     *
     * @return the input stream.
     */
    InputStream getMessageBody();

    /**
     * {@return the method}
     */
    String getMethod();

    /**
     * {@return the remote address}
     */
    String getRemoteAddress();

    /**
     * {@return the remote hostname}
     */
    String getRemoteHostname();

    /**
     * {@return the remote port}
     */
    int getRemotePort();

    /**
     * {@return the request target}
     */
    String getRequestTarget();
}
