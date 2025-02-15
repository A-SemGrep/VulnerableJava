

package org.owasp.webgoat.lessons.pathtraversal;

import org.owasp.webgoat.container.lessons.Category;
import org.owasp.webgoat.container.lessons.Lesson;
import org.springframework.stereotype.Component;

@Component
public class PathTraversal extends Lesson {

  @Override
  public Category getDefaultCategory() {
    return Category.A3;
  }

  @Override
  public String getTitle() {
    return "path-traversal-title";
  }
}
