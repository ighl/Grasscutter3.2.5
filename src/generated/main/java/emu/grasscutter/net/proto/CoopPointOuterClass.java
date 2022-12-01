// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CoopPointOuterClass
{
    private static final Descriptors.Descriptor internal_static_CoopPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopPoint_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopPointOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopPointOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fCoopPoint.proto\"\u0096\u0001\n\tCoopPoint\u0012\u0017\n\u000fself_confidence\u0018\u000f \u0001(\r\u0012\u001f\n\u0005state\u0018\n \u0001(\u000e2\u0010.CoopPoint.State\u0012\n\n\u0002id\u0018\u000e \u0001(\r\"C\n\u0005State\u0012\u0013\n\u000fSTATE_UNSTARTED\u0010\u0000\u0012\u0011\n\rSTATE_STARTED\u0010\u0001\u0012\u0012\n\u000eSTATE_FINISHED\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopPointOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CoopPoint_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CoopPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopPointOuterClass.internal_static_CoopPoint_descriptor, new String[] { "SelfConfidence", "State", "Id" });
    }
    
    public static final class CoopPoint extends GeneratedMessageV3 implements CoopPointOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SELF_CONFIDENCE_FIELD_NUMBER = 15;
        private int selfConfidence_;
        public static final int STATE_FIELD_NUMBER = 10;
        private int state_;
        public static final int ID_FIELD_NUMBER = 14;
        private int id_;
        private byte memoizedIsInitialized;
        private static final CoopPoint DEFAULT_INSTANCE;
        private static final Parser<CoopPoint> PARSER;
        
        private CoopPoint(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CoopPoint() {
            this.memoizedIsInitialized = -1;
            this.state_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CoopPoint();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CoopPoint(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 80: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
                            continue;
                        }
                        case 112: {
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.selfConfidence_ = input.readUInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CoopPointOuterClass.internal_static_CoopPoint_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CoopPointOuterClass.internal_static_CoopPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopPoint.class, Builder.class);
        }
        
        @Override
        public int getSelfConfidence() {
            return this.selfConfidence_;
        }
        
        @Override
        public int getStateValue() {
            return this.state_;
        }
        
        @Override
        public State getState() {
            final State result = State.valueOf(this.state_);
            return (result == null) ? State.UNRECOGNIZED : result;
        }
        
        @Override
        public int getId() {
            return this.id_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.state_ != State.STATE_UNSTARTED.getNumber()) {
                output.writeEnum(10, this.state_);
            }
            if (this.id_ != 0) {
                output.writeUInt32(14, this.id_);
            }
            if (this.selfConfidence_ != 0) {
                output.writeUInt32(15, this.selfConfidence_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.state_ != State.STATE_UNSTARTED.getNumber()) {
                size += CodedOutputStream.computeEnumSize(10, this.state_);
            }
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.id_);
            }
            if (this.selfConfidence_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.selfConfidence_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoopPoint)) {
                return super.equals(obj);
            }
            final CoopPoint other = (CoopPoint)obj;
            return this.getSelfConfidence() == other.getSelfConfidence() && this.state_ == other.state_ && this.getId() == other.getId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getSelfConfidence();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.state_;
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CoopPoint parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data);
        }
        
        public static CoopPoint parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopPoint parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data);
        }
        
        public static CoopPoint parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopPoint parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data);
        }
        
        public static CoopPoint parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopPoint parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopPoint.PARSER, input);
        }
        
        public static CoopPoint parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopPoint.PARSER, input, extensionRegistry);
        }
        
        public static CoopPoint parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopPoint.PARSER, input);
        }
        
        public static CoopPoint parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopPoint.PARSER, input, extensionRegistry);
        }
        
        public static CoopPoint parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopPoint.PARSER, input);
        }
        
        public static CoopPoint parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopPoint.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CoopPoint.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CoopPoint prototype) {
            return CoopPoint.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CoopPoint.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CoopPoint getDefaultInstance() {
            return CoopPoint.DEFAULT_INSTANCE;
        }
        
        public static Parser<CoopPoint> parser() {
            return CoopPoint.PARSER;
        }
        
        @Override
        public Parser<CoopPoint> getParserForType() {
            return CoopPoint.PARSER;
        }
        
        @Override
        public CoopPoint getDefaultInstanceForType() {
            return CoopPoint.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CoopPoint();
            PARSER = new AbstractParser<CoopPoint>() {
                @Override
                public CoopPoint parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CoopPoint(input, extensionRegistry);
                }
            };
        }
        
        public enum State implements ProtocolMessageEnum
        {
            STATE_UNSTARTED(0), 
            STATE_STARTED(1), 
            STATE_FINISHED(2), 
            UNRECOGNIZED(-1);
            
            public static final int STATE_UNSTARTED_VALUE = 0;
            public static final int STATE_STARTED_VALUE = 1;
            public static final int STATE_FINISHED_VALUE = 2;
            private static final Internal.EnumLiteMap<State> internalValueMap;
            private static final State[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == State.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static State valueOf(final int value) {
                return forNumber(value);
            }
            
            public static State forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return State.STATE_UNSTARTED;
                    }
                    case 1: {
                        return State.STATE_STARTED;
                    }
                    case 2: {
                        return State.STATE_FINISHED;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return State.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == State.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CoopPoint.getDescriptor().getEnumTypes().get(0);
            }
            
            public static State valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return State.UNRECOGNIZED;
                }
                return State.VALUES[desc.getIndex()];
            }
            
            private State(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ State[] value() {
                return new State[] { State.STATE_UNSTARTED, State.STATE_STARTED, State.STATE_FINISHED, State.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<State>() {
                    @Override
                    public State findValueByNumber(final int number) {
                        return State.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoopPointOrBuilder
        {
            private int selfConfidence_;
            private int state_;
            private int id_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CoopPointOuterClass.internal_static_CoopPoint_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CoopPointOuterClass.internal_static_CoopPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopPoint.class, Builder.class);
            }
            
            private Builder() {
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CoopPoint.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.selfConfidence_ = 0;
                this.state_ = 0;
                this.id_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CoopPointOuterClass.internal_static_CoopPoint_descriptor;
            }
            
            @Override
            public CoopPoint getDefaultInstanceForType() {
                return CoopPoint.getDefaultInstance();
            }
            
            @Override
            public CoopPoint build() {
                final CoopPoint result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CoopPoint buildPartial() {
                final CoopPoint result = new CoopPoint(this);
                result.selfConfidence_ = this.selfConfidence_;
                result.state_ = this.state_;
                result.id_ = this.id_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof CoopPoint) {
                    return this.mergeFrom((CoopPoint)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CoopPoint other) {
                if (other == CoopPoint.getDefaultInstance()) {
                    return this;
                }
                if (other.getSelfConfidence() != 0) {
                    this.setSelfConfidence(other.getSelfConfidence());
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                CoopPoint parsedMessage = null;
                try {
                    parsedMessage = CoopPoint.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CoopPoint)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getSelfConfidence() {
                return this.selfConfidence_;
            }
            
            public Builder setSelfConfidence(final int value) {
                this.selfConfidence_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSelfConfidence() {
                this.selfConfidence_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStateValue() {
                return this.state_;
            }
            
            public Builder setStateValue(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public State getState() {
                final State result = State.valueOf(this.state_);
                return (result == null) ? State.UNRECOGNIZED : result;
            }
            
            public Builder setState(final State value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.state_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface CoopPointOrBuilder extends MessageOrBuilder
    {
        int getSelfConfidence();
        
        int getStateValue();
        
        CoopPoint.State getState();
        
        int getId();
    }
}
