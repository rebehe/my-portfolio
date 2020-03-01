// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random inspirational quote to the page.
 */
function getRandomQuote() {
  fetch('/quotes')
    .then(response => response.text())
    .then((quote) => {
      document.getElementById('quote-container').innerText = quote;
    });
}

/**
 * Gets comments from server as JSON and adds them to the comments
 * section of the page.
 */
function getComments() {
    fetch('/comments')
      .then(response => response.json())
      .then(comments => {
          // For debugging purposes
          console.log(comments);

          const commentsListElement = document.getElementById('comments-list');
          commentsListElement.innerHTML = '';
          comments.forEach(comment => {
            var listElement = createListElement(comment);
            commentsListElement.appendChild(listElement);
          });
      });
}

/** Creates an <li> element containing text. */
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}