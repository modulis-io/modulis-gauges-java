/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.modulis.gauges.spi.alpha;

import io.humainary.gauges.Gauges;
import io.humainary.substrates.Substrates.Environment;
import io.humainary.substrates.Substrates.Name;
import io.humainary.substrates.Substrates.Type;
import io.humainary.substrates.sdk.AbstractContext;

import static io.humainary.gauges.Gauges.Gauge.TYPE;

final class Context
  extends AbstractContext< Gauges.Gauge, Long >
  implements Gauges.Context {

  Context (
    final Environment environment,
    final Producer< ? extends Gauges.Gauge, Long > producer
  ) {

    super (
      environment,
      producer
    );

  }

  @Override
  protected Type type () {

    return
      TYPE;

  }

  @Override
  public Gauges.Gauge gauge (
    final Name name
  ) {

    return
      instrument (
        name
      );

  }

}
