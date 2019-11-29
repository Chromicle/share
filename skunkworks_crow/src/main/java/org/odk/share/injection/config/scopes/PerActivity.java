package org.odk.share.injection.config.scopes;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;

/**
* Dependencies in this Scope will last as long as a single Activity does. Anything depending on the
* Activity Context should be labeled with this Scope.
*/
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {}
