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

public final class UpdateAbilityCreatedMovingPlatformNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UpdateAbilityCreatedMovingPlatformNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UpdateAbilityCreatedMovingPlatformNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n.UpdateAbilityCreatedMovingPlatformNotify.proto\"\u00ca\u0001\n(UpdateAbilityCreatedMovingPlatformNotify\u0012\u0011\n\tentity_id\u0018\u0004 \u0001(\r\u0012A\n\u0007op_type\u0018\u0003 \u0001(\u000e20.UpdateAbilityCreatedMovingPlatformNotify.OpType\"H\n\u0006OpType\u0012\u0010\n\fOP_TYPE_NONE\u0010\u0000\u0012\u0014\n\u0010OP_TYPE_ACTIVATE\u0010\u0001\u0012\u0016\n\u0012OP_TYPE_DEACTIVATE\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UpdateAbilityCreatedMovingPlatformNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UpdateAbilityCreatedMovingPlatformNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor, new String[] { "EntityId", "OpType" });
    }
    
    public static final class UpdateAbilityCreatedMovingPlatformNotify extends GeneratedMessageV3 implements UpdateAbilityCreatedMovingPlatformNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 4;
        private int entityId_;
        public static final int OP_TYPE_FIELD_NUMBER = 3;
        private int opType_;
        private byte memoizedIsInitialized;
        private static final UpdateAbilityCreatedMovingPlatformNotify DEFAULT_INSTANCE;
        private static final Parser<UpdateAbilityCreatedMovingPlatformNotify> PARSER;
        
        private UpdateAbilityCreatedMovingPlatformNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private UpdateAbilityCreatedMovingPlatformNotify() {
            this.memoizedIsInitialized = -1;
            this.opType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UpdateAbilityCreatedMovingPlatformNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UpdateAbilityCreatedMovingPlatformNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            final int rawValue = input.readEnum();
                            this.opType_ = rawValue;
                            continue;
                        }
                        case 32: {
                            this.entityId_ = input.readUInt32();
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
            return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAbilityCreatedMovingPlatformNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getOpTypeValue() {
            return this.opType_;
        }
        
        @Override
        public OpType getOpType() {
            final OpType result = OpType.valueOf(this.opType_);
            return (result == null) ? OpType.UNRECOGNIZED : result;
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
            if (this.opType_ != OpType.OP_TYPE_NONE.getNumber()) {
                output.writeEnum(3, this.opType_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(4, this.entityId_);
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
            if (this.opType_ != OpType.OP_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(3, this.opType_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateAbilityCreatedMovingPlatformNotify)) {
                return super.equals(obj);
            }
            final UpdateAbilityCreatedMovingPlatformNotify other = (UpdateAbilityCreatedMovingPlatformNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.opType_ == other.opType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.opType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input, extensionRegistry);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input, extensionRegistry);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input);
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UpdateAbilityCreatedMovingPlatformNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UpdateAbilityCreatedMovingPlatformNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UpdateAbilityCreatedMovingPlatformNotify prototype) {
            return UpdateAbilityCreatedMovingPlatformNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UpdateAbilityCreatedMovingPlatformNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UpdateAbilityCreatedMovingPlatformNotify getDefaultInstance() {
            return UpdateAbilityCreatedMovingPlatformNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<UpdateAbilityCreatedMovingPlatformNotify> parser() {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER;
        }
        
        @Override
        public Parser<UpdateAbilityCreatedMovingPlatformNotify> getParserForType() {
            return UpdateAbilityCreatedMovingPlatformNotify.PARSER;
        }
        
        @Override
        public UpdateAbilityCreatedMovingPlatformNotify getDefaultInstanceForType() {
            return UpdateAbilityCreatedMovingPlatformNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UpdateAbilityCreatedMovingPlatformNotify();
            PARSER = new AbstractParser<UpdateAbilityCreatedMovingPlatformNotify>() {
                @Override
                public UpdateAbilityCreatedMovingPlatformNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UpdateAbilityCreatedMovingPlatformNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum OpType implements ProtocolMessageEnum
        {
            OP_TYPE_NONE(0), 
            OP_TYPE_ACTIVATE(1), 
            OP_TYPE_DEACTIVATE(2), 
            UNRECOGNIZED(-1);
            
            public static final int OP_TYPE_NONE_VALUE = 0;
            public static final int OP_TYPE_ACTIVATE_VALUE = 1;
            public static final int OP_TYPE_DEACTIVATE_VALUE = 2;
            private static final Internal.EnumLiteMap<OpType> internalValueMap;
            private static final OpType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == OpType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static OpType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static OpType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return OpType.OP_TYPE_NONE;
                    }
                    case 1: {
                        return OpType.OP_TYPE_ACTIVATE;
                    }
                    case 2: {
                        return OpType.OP_TYPE_DEACTIVATE;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<OpType> internalGetValueMap() {
                return OpType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == OpType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateAbilityCreatedMovingPlatformNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static OpType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return OpType.UNRECOGNIZED;
                }
                return OpType.VALUES[desc.getIndex()];
            }
            
            private OpType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ OpType[] value() {
                return new OpType[] { OpType.OP_TYPE_NONE, OpType.OP_TYPE_ACTIVATE, OpType.OP_TYPE_DEACTIVATE, OpType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<OpType>() {
                    @Override
                    public OpType findValueByNumber(final int number) {
                        return OpType.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateAbilityCreatedMovingPlatformNotifyOrBuilder
        {
            private int entityId_;
            private int opType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAbilityCreatedMovingPlatformNotify.class, Builder.class);
            }
            
            private Builder() {
                this.opType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.opType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UpdateAbilityCreatedMovingPlatformNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.opType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UpdateAbilityCreatedMovingPlatformNotifyOuterClass.internal_static_UpdateAbilityCreatedMovingPlatformNotify_descriptor;
            }
            
            @Override
            public UpdateAbilityCreatedMovingPlatformNotify getDefaultInstanceForType() {
                return UpdateAbilityCreatedMovingPlatformNotify.getDefaultInstance();
            }
            
            @Override
            public UpdateAbilityCreatedMovingPlatformNotify build() {
                final UpdateAbilityCreatedMovingPlatformNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UpdateAbilityCreatedMovingPlatformNotify buildPartial() {
                final UpdateAbilityCreatedMovingPlatformNotify result = new UpdateAbilityCreatedMovingPlatformNotify(this);
                result.entityId_ = this.entityId_;
                result.opType_ = this.opType_;
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
                if (other instanceof UpdateAbilityCreatedMovingPlatformNotify) {
                    return this.mergeFrom((UpdateAbilityCreatedMovingPlatformNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UpdateAbilityCreatedMovingPlatformNotify other) {
                if (other == UpdateAbilityCreatedMovingPlatformNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.opType_ != 0) {
                    this.setOpTypeValue(other.getOpTypeValue());
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
                UpdateAbilityCreatedMovingPlatformNotify parsedMessage = null;
                try {
                    parsedMessage = UpdateAbilityCreatedMovingPlatformNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UpdateAbilityCreatedMovingPlatformNotify)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOpTypeValue() {
                return this.opType_;
            }
            
            public Builder setOpTypeValue(final int value) {
                this.opType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public OpType getOpType() {
                final OpType result = OpType.valueOf(this.opType_);
                return (result == null) ? OpType.UNRECOGNIZED : result;
            }
            
            public Builder setOpType(final OpType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.opType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOpType() {
                this.opType_ = 0;
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
    
    public interface UpdateAbilityCreatedMovingPlatformNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        int getOpTypeValue();
        
        UpdateAbilityCreatedMovingPlatformNotify.OpType getOpType();
    }
}
