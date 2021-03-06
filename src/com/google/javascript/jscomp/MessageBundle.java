/*
 * Copyright 2004 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

/**
 * An interface for providing alternative values for user-visible messages in
 * JavaScript code.
 */
public interface MessageBundle {

  /**
   * Gets the message ID generator to use to compute message IDs for this
   * type of bundle.
   * @return idGenerator instance or null if we do not want to use any custom
   *     id generation. In case if idGenerator is null caller should decide how
   *     to create id by itself. In the most cases using the message key is
   *     enough.
   */
  public JsMessage.IdGenerator idGenerator();

  /**
   * Gets a message replacement.
   *
   * @param id the id of the message being replaced; the key is message ID
   *     generated by {@link JsMessage.IdGenerator}
   * @return the message replacement, which may be null.
   */
  public JsMessage getMessage(String id);

  /**
   * Returns an iterable over the keys that this object has replacements for.
   * @return all messages from this bundle.
   */
  public Iterable<JsMessage> getAllMessages();
}
