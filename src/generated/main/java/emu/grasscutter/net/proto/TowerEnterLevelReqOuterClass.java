// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class TowerEnterLevelReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerEnterLevelReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerEnterLevelReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerEnterLevelReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerEnterLevelReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018TowerEnterLevelReq.proto\",\n\u0012TowerEnterLevelReq\u0012\u0016\n\u000eenter_point_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerEnterLevelReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerEnterLevelReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerEnterLevelReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor, new String[] { "EnterPointId" });
    }
    
    public static final class TowerEnterLevelReq extends GeneratedMessageV3 implements TowerEnterLevelReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTER_POINT_ID_FIELD_NUMBER = 3;
        private int enterPointId_;
        private byte memoizedIsInitialized;
        private static final TowerEnterLevelReq DEFAULT_INSTANCE;
        private static final Parser<TowerEnterLevelReq> PARSER;
        
        private TowerEnterLevelReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerEnterLevelReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerEnterLevelReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerEnterLevelReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.enterPointId_ = input.readUInt32();
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
            return TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerEnterLevelReq.class, Builder.class);
        }
        
        @Override
        public int getEnterPointId() {
            return this.enterPointId_;
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
            if (this.enterPointId_ != 0) {
                output.writeUInt32(3, this.enterPointId_);
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
            if (this.enterPointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.enterPointId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerEnterLevelReq)) {
                return super.equals(obj);
            }
            final TowerEnterLevelReq other = (TowerEnterLevelReq)obj;
            return this.getEnterPointId() == other.getEnterPointId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getEnterPointId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerEnterLevelReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelReq.PARSER, input);
        }
        
        public static TowerEnterLevelReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerEnterLevelReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerEnterLevelReq.PARSER, input);
        }
        
        public static TowerEnterLevelReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerEnterLevelReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerEnterLevelReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelReq.PARSER, input);
        }
        
        public static TowerEnterLevelReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerEnterLevelReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerEnterLevelReq prototype) {
            return TowerEnterLevelReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerEnterLevelReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerEnterLevelReq getDefaultInstance() {
            return TowerEnterLevelReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerEnterLevelReq> parser() {
            return TowerEnterLevelReq.PARSER;
        }
        
        @Override
        public Parser<TowerEnterLevelReq> getParserForType() {
            return TowerEnterLevelReq.PARSER;
        }
        
        @Override
        public TowerEnterLevelReq getDefaultInstanceForType() {
            return TowerEnterLevelReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerEnterLevelReq();
            PARSER = new AbstractParser<TowerEnterLevelReq>() {
                @Override
                public TowerEnterLevelReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerEnterLevelReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerEnterLevelReqOrBuilder
        {
            private int enterPointId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerEnterLevelReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerEnterLevelReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.enterPointId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
            }
            
            @Override
            public TowerEnterLevelReq getDefaultInstanceForType() {
                return TowerEnterLevelReq.getDefaultInstance();
            }
            
            @Override
            public TowerEnterLevelReq build() {
                final TowerEnterLevelReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerEnterLevelReq buildPartial() {
                final TowerEnterLevelReq result = new TowerEnterLevelReq(this);
                result.enterPointId_ = this.enterPointId_;
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
                if (other instanceof TowerEnterLevelReq) {
                    return this.mergeFrom((TowerEnterLevelReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerEnterLevelReq other) {
                if (other == TowerEnterLevelReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getEnterPointId() != 0) {
                    this.setEnterPointId(other.getEnterPointId());
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
                TowerEnterLevelReq parsedMessage = null;
                try {
                    parsedMessage = TowerEnterLevelReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerEnterLevelReq)e.getUnfinishedMessage();
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
            public int getEnterPointId() {
                return this.enterPointId_;
            }
            
            public Builder setEnterPointId(final int value) {
                this.enterPointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnterPointId() {
                this.enterPointId_ = 0;
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
    
    public interface TowerEnterLevelReqOrBuilder extends MessageOrBuilder
    {
        int getEnterPointId();
    }
}
