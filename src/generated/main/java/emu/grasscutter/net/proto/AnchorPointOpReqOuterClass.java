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

public final class AnchorPointOpReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AnchorPointOpReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AnchorPointOpReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AnchorPointOpReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AnchorPointOpReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016AnchorPointOpReq.proto\"\u00c1\u0001\n\u0010AnchorPointOpReq\u0012\u0017\n\u000fanchor_point_id\u0018\t \u0001(\r\u0012\u001c\n\u0014anchor_point_op_type\u0018\f \u0001(\r\"v\n\u0011AnchorPointOpType\u0012\u001d\n\u0019ANCHOR_POINT_OP_TYPE_NONE\u0010\u0000\u0012!\n\u001dANCHOR_POINT_OP_TYPE_TELEPORT\u0010\u0001\u0012\u001f\n\u001bANCHOR_POINT_OP_TYPE_REMOVE\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AnchorPointOpReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AnchorPointOpReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AnchorPointOpReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor, new String[] { "AnchorPointId", "AnchorPointOpType" });
    }
    
    public static final class AnchorPointOpReq extends GeneratedMessageV3 implements AnchorPointOpReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ANCHOR_POINT_ID_FIELD_NUMBER = 9;
        private int anchorPointId_;
        public static final int ANCHOR_POINT_OP_TYPE_FIELD_NUMBER = 12;
        private int anchorPointOpType_;
        private byte memoizedIsInitialized;
        private static final AnchorPointOpReq DEFAULT_INSTANCE;
        private static final Parser<AnchorPointOpReq> PARSER;
        
        private AnchorPointOpReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AnchorPointOpReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AnchorPointOpReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AnchorPointOpReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.anchorPointId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.anchorPointOpType_ = input.readUInt32();
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
            return AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AnchorPointOpReq.class, Builder.class);
        }
        
        @Override
        public int getAnchorPointId() {
            return this.anchorPointId_;
        }
        
        @Override
        public int getAnchorPointOpType() {
            return this.anchorPointOpType_;
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
            if (this.anchorPointId_ != 0) {
                output.writeUInt32(9, this.anchorPointId_);
            }
            if (this.anchorPointOpType_ != 0) {
                output.writeUInt32(12, this.anchorPointOpType_);
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
            if (this.anchorPointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.anchorPointId_);
            }
            if (this.anchorPointOpType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.anchorPointOpType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnchorPointOpReq)) {
                return super.equals(obj);
            }
            final AnchorPointOpReq other = (AnchorPointOpReq)obj;
            return this.getAnchorPointId() == other.getAnchorPointId() && this.getAnchorPointOpType() == other.getAnchorPointOpType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getAnchorPointId();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getAnchorPointOpType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AnchorPointOpReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data);
        }
        
        public static AnchorPointOpReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointOpReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data);
        }
        
        public static AnchorPointOpReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointOpReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data);
        }
        
        public static AnchorPointOpReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointOpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointOpReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointOpReq.PARSER, input);
        }
        
        public static AnchorPointOpReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointOpReq.PARSER, input, extensionRegistry);
        }
        
        public static AnchorPointOpReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnchorPointOpReq.PARSER, input);
        }
        
        public static AnchorPointOpReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnchorPointOpReq.PARSER, input, extensionRegistry);
        }
        
        public static AnchorPointOpReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointOpReq.PARSER, input);
        }
        
        public static AnchorPointOpReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointOpReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AnchorPointOpReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AnchorPointOpReq prototype) {
            return AnchorPointOpReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AnchorPointOpReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AnchorPointOpReq getDefaultInstance() {
            return AnchorPointOpReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AnchorPointOpReq> parser() {
            return AnchorPointOpReq.PARSER;
        }
        
        @Override
        public Parser<AnchorPointOpReq> getParserForType() {
            return AnchorPointOpReq.PARSER;
        }
        
        @Override
        public AnchorPointOpReq getDefaultInstanceForType() {
            return AnchorPointOpReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AnchorPointOpReq();
            PARSER = new AbstractParser<AnchorPointOpReq>() {
                @Override
                public AnchorPointOpReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AnchorPointOpReq(input, extensionRegistry);
                }
            };
        }
        
        public enum AnchorPointOpType implements ProtocolMessageEnum
        {
            ANCHOR_POINT_OP_TYPE_NONE(0), 
            ANCHOR_POINT_OP_TYPE_TELEPORT(1), 
            ANCHOR_POINT_OP_TYPE_REMOVE(2), 
            UNRECOGNIZED(-1);
            
            public static final int ANCHOR_POINT_OP_TYPE_NONE_VALUE = 0;
            public static final int ANCHOR_POINT_OP_TYPE_TELEPORT_VALUE = 1;
            public static final int ANCHOR_POINT_OP_TYPE_REMOVE_VALUE = 2;
            private static final Internal.EnumLiteMap<AnchorPointOpType> internalValueMap;
            private static final AnchorPointOpType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == AnchorPointOpType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static AnchorPointOpType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static AnchorPointOpType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return AnchorPointOpType.ANCHOR_POINT_OP_TYPE_NONE;
                    }
                    case 1: {
                        return AnchorPointOpType.ANCHOR_POINT_OP_TYPE_TELEPORT;
                    }
                    case 2: {
                        return AnchorPointOpType.ANCHOR_POINT_OP_TYPE_REMOVE;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<AnchorPointOpType> internalGetValueMap() {
                return AnchorPointOpType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == AnchorPointOpType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AnchorPointOpReq.getDescriptor().getEnumTypes().get(0);
            }
            
            public static AnchorPointOpType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return AnchorPointOpType.UNRECOGNIZED;
                }
                return AnchorPointOpType.VALUES[desc.getIndex()];
            }
            
            private AnchorPointOpType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ AnchorPointOpType[] value() {
                return new AnchorPointOpType[] { AnchorPointOpType.ANCHOR_POINT_OP_TYPE_NONE, AnchorPointOpType.ANCHOR_POINT_OP_TYPE_TELEPORT, AnchorPointOpType.ANCHOR_POINT_OP_TYPE_REMOVE, AnchorPointOpType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<AnchorPointOpType>() {
                    @Override
                    public AnchorPointOpType findValueByNumber(final int number) {
                        return AnchorPointOpType.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AnchorPointOpReqOrBuilder
        {
            private int anchorPointId_;
            private int anchorPointOpType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AnchorPointOpReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AnchorPointOpReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.anchorPointId_ = 0;
                this.anchorPointOpType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
            }
            
            @Override
            public AnchorPointOpReq getDefaultInstanceForType() {
                return AnchorPointOpReq.getDefaultInstance();
            }
            
            @Override
            public AnchorPointOpReq build() {
                final AnchorPointOpReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AnchorPointOpReq buildPartial() {
                final AnchorPointOpReq result = new AnchorPointOpReq(this);
                result.anchorPointId_ = this.anchorPointId_;
                result.anchorPointOpType_ = this.anchorPointOpType_;
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
                if (other instanceof AnchorPointOpReq) {
                    return this.mergeFrom((AnchorPointOpReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AnchorPointOpReq other) {
                if (other == AnchorPointOpReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAnchorPointId() != 0) {
                    this.setAnchorPointId(other.getAnchorPointId());
                }
                if (other.getAnchorPointOpType() != 0) {
                    this.setAnchorPointOpType(other.getAnchorPointOpType());
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
                AnchorPointOpReq parsedMessage = null;
                try {
                    parsedMessage = AnchorPointOpReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AnchorPointOpReq)e.getUnfinishedMessage();
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
            public int getAnchorPointId() {
                return this.anchorPointId_;
            }
            
            public Builder setAnchorPointId(final int value) {
                this.anchorPointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAnchorPointId() {
                this.anchorPointId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAnchorPointOpType() {
                return this.anchorPointOpType_;
            }
            
            public Builder setAnchorPointOpType(final int value) {
                this.anchorPointOpType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAnchorPointOpType() {
                this.anchorPointOpType_ = 0;
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
    
    public interface AnchorPointOpReqOrBuilder extends MessageOrBuilder
    {
        int getAnchorPointId();
        
        int getAnchorPointOpType();
    }
}
