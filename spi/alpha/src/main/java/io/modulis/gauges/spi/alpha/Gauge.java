/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.modulis.gauges.spi.alpha;

import io.humainary.gauges.Gauges;
import io.humainary.substrates.Substrates.Inlet;
import io.humainary.substrates.sdk.AbstractInstrument;


final class Gauge
  extends AbstractInstrument< Long >
  implements Gauges.Gauge {

  private static final Long INC = 1L;
  private static final Long DEC = -1L;

  Gauge (
    final Inlet< Long > inlet
  ) {

    super (
      inlet
    );

  }

  @Override
  public void inc () {

    inlet.emit (
      INC
    );

  }

  @Override
  public void dec () {

    inlet.emit (
      DEC
    );

  }

}
