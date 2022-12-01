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

public final class CoopRewardOuterClass
{
    private static final Descriptors.Descriptor internal_static_CoopReward_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopReward_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopRewardOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopRewardOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010CoopReward.proto\"v\n\nCoopReward\u0012\n\n\u0002id\u0018\u0005 \u0001(\r\u0012 \n\u0005state\u0018\u0006 \u0001(\u000e2\u0011.CoopReward.State\":\n\u0005State\u0012\u0010\n\fSTATE_UNLOCK\u0010\u0000\u0012\u000e\n\nSTATE_LOCK\u0010\u0001\u0012\u000f\n\u000bSTATE_TAKEN\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopRewardOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CoopReward_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CoopReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopRewardOuterClass.internal_static_CoopReward_descriptor, new String[] { "Id", "State" });
    }
    
    public static final class CoopReward extends GeneratedMessageV3 implements CoopRewardOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 5;
        private int id_;
        public static final int STATE_FIELD_NUMBER = 6;
        private int state_;
        private byte memoizedIsInitialized;
        private static final CoopReward DEFAULT_INSTANCE;
        private static final Parser<CoopReward> PARSER;
        
        private CoopReward(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CoopReward() {
            this.memoizedIsInitialized = -1;
            this.state_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CoopReward();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CoopReward(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
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
            return CoopRewardOuterClass.internal_static_CoopReward_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CoopRewardOuterClass.internal_static_CoopReward_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopReward.class, Builder.class);
        }
        
        @Override
        public int getId() {
            return this.id_;
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
            if (this.id_ != 0) {
                output.writeUInt32(5, this.id_);
            }
            if (this.state_ != State.STATE_UNLOCK.getNumber()) {
                output.writeEnum(6, this.state_);
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
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.id_);
            }
            if (this.state_ != State.STATE_UNLOCK.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.state_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoopReward)) {
                return super.equals(obj);
            }
            final CoopReward other = (CoopReward)obj;
            return this.getId() == other.getId() && this.state_ == other.state_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.state_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CoopReward parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data);
        }
        
        public static CoopReward parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopReward parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data);
        }
        
        public static CoopReward parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopReward parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data);
        }
        
        public static CoopReward parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopReward.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopReward parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopReward.PARSER, input);
        }
        
        public static CoopReward parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopReward.PARSER, input, extensionRegistry);
        }
        
        public static CoopReward parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopReward.PARSER, input);
        }
        
        public static CoopReward parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopReward.PARSER, input, extensionRegistry);
        }
        
        public static CoopReward parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopReward.PARSER, input);
        }
        
        public static CoopReward parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopReward.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CoopReward.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CoopReward prototype) {
            return CoopReward.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CoopReward.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CoopReward getDefaultInstance() {
            return CoopReward.DEFAULT_INSTANCE;
        }
        
        public static Parser<CoopReward> parser() {
            return CoopReward.PARSER;
        }
        
        @Override
        public Parser<CoopReward> getParserForType() {
            return CoopReward.PARSER;
        }
        
        @Override
        public CoopReward getDefaultInstanceForType() {
            return CoopReward.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CoopReward();
            PARSER = new AbstractParser<CoopReward>() {
                @Override
                public CoopReward parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CoopReward(input, extensionRegistry);
                }
            };
        }
        
        public enum State implements ProtocolMessageEnum
        {
            STATE_UNLOCK(0), 
            STATE_LOCK(1), 
            STATE_TAKEN(2), 
            UNRECOGNIZED(-1);
            
            public static final int STATE_UNLOCK_VALUE = 0;
            public static final int STATE_LOCK_VALUE = 1;
            public static final int STATE_TAKEN_VALUE = 2;
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
                        return State.STATE_UNLOCK;
                    }
                    case 1: {
                        return State.STATE_LOCK;
                    }
                    case 2: {
                        return State.STATE_TAKEN;
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
                return CoopReward.getDescriptor().getEnumTypes().get(0);
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
                return new State[] { State.STATE_UNLOCK, State.STATE_LOCK, State.STATE_TAKEN, State.UNRECOGNIZED };
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
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoopRewardOrBuilder
        {
            private int id_;
            private int state_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CoopRewardOuterClass.internal_static_CoopReward_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CoopRewardOuterClass.internal_static_CoopReward_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopReward.class, Builder.class);
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
                if (CoopReward.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.id_ = 0;
                this.state_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CoopRewardOuterClass.internal_static_CoopReward_descriptor;
            }
            
            @Override
            public CoopReward getDefaultInstanceForType() {
                return CoopReward.getDefaultInstance();
            }
            
            @Override
            public CoopReward build() {
                final CoopReward result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CoopReward buildPartial() {
                final CoopReward result = new CoopReward(this);
                result.id_ = this.id_;
                result.state_ = this.state_;
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
                if (other instanceof CoopReward) {
                    return this.mergeFrom((CoopReward)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CoopReward other) {
                if (other == CoopReward.getDefaultInstance()) {
                    return this;
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
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
                CoopReward parsedMessage = null;
                try {
                    parsedMessage = CoopReward.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CoopReward)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface CoopRewardOrBuilder extends MessageOrBuilder
    {
        int getId();
        
        int getStateValue();
        
        CoopReward.State getState();
    }
}
