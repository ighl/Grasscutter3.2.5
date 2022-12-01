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

public final class TakeCompoundOutputReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeCompoundOutputReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeCompoundOutputReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeCompoundOutputReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeCompoundOutputReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bTakeCompoundOutputReq.proto\"G\n\u0015TakeCompoundOutputReq\u0012\u0019\n\u0011compound_group_id\u0018\u0003 \u0001(\r\u0012\u0013\n\u000bcompound_id\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeCompoundOutputReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeCompoundOutputReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeCompoundOutputReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor, new String[] { "CompoundGroupId", "CompoundId" });
    }
    
    public static final class TakeCompoundOutputReq extends GeneratedMessageV3 implements TakeCompoundOutputReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMPOUND_GROUP_ID_FIELD_NUMBER = 3;
        private int compoundGroupId_;
        public static final int COMPOUND_ID_FIELD_NUMBER = 10;
        private int compoundId_;
        private byte memoizedIsInitialized;
        private static final TakeCompoundOutputReq DEFAULT_INSTANCE;
        private static final Parser<TakeCompoundOutputReq> PARSER;
        
        private TakeCompoundOutputReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeCompoundOutputReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeCompoundOutputReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeCompoundOutputReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.compoundGroupId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.compoundId_ = input.readUInt32();
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
            return TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeCompoundOutputReq.class, Builder.class);
        }
        
        @Override
        public int getCompoundGroupId() {
            return this.compoundGroupId_;
        }
        
        @Override
        public int getCompoundId() {
            return this.compoundId_;
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
            if (this.compoundGroupId_ != 0) {
                output.writeUInt32(3, this.compoundGroupId_);
            }
            if (this.compoundId_ != 0) {
                output.writeUInt32(10, this.compoundId_);
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
            if (this.compoundGroupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.compoundGroupId_);
            }
            if (this.compoundId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.compoundId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeCompoundOutputReq)) {
                return super.equals(obj);
            }
            final TakeCompoundOutputReq other = (TakeCompoundOutputReq)obj;
            return this.getCompoundGroupId() == other.getCompoundGroupId() && this.getCompoundId() == other.getCompoundId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCompoundGroupId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getCompoundId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeCompoundOutputReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputReq.PARSER, input);
        }
        
        public static TakeCompoundOutputReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeCompoundOutputReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeCompoundOutputReq.PARSER, input);
        }
        
        public static TakeCompoundOutputReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeCompoundOutputReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeCompoundOutputReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputReq.PARSER, input);
        }
        
        public static TakeCompoundOutputReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeCompoundOutputReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeCompoundOutputReq prototype) {
            return TakeCompoundOutputReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeCompoundOutputReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeCompoundOutputReq getDefaultInstance() {
            return TakeCompoundOutputReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeCompoundOutputReq> parser() {
            return TakeCompoundOutputReq.PARSER;
        }
        
        @Override
        public Parser<TakeCompoundOutputReq> getParserForType() {
            return TakeCompoundOutputReq.PARSER;
        }
        
        @Override
        public TakeCompoundOutputReq getDefaultInstanceForType() {
            return TakeCompoundOutputReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeCompoundOutputReq();
            PARSER = new AbstractParser<TakeCompoundOutputReq>() {
                @Override
                public TakeCompoundOutputReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeCompoundOutputReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeCompoundOutputReqOrBuilder
        {
            private int compoundGroupId_;
            private int compoundId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeCompoundOutputReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeCompoundOutputReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.compoundGroupId_ = 0;
                this.compoundId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
            }
            
            @Override
            public TakeCompoundOutputReq getDefaultInstanceForType() {
                return TakeCompoundOutputReq.getDefaultInstance();
            }
            
            @Override
            public TakeCompoundOutputReq build() {
                final TakeCompoundOutputReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeCompoundOutputReq buildPartial() {
                final TakeCompoundOutputReq result = new TakeCompoundOutputReq(this);
                result.compoundGroupId_ = this.compoundGroupId_;
                result.compoundId_ = this.compoundId_;
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
                if (other instanceof TakeCompoundOutputReq) {
                    return this.mergeFrom((TakeCompoundOutputReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeCompoundOutputReq other) {
                if (other == TakeCompoundOutputReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getCompoundGroupId() != 0) {
                    this.setCompoundGroupId(other.getCompoundGroupId());
                }
                if (other.getCompoundId() != 0) {
                    this.setCompoundId(other.getCompoundId());
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
                TakeCompoundOutputReq parsedMessage = null;
                try {
                    parsedMessage = TakeCompoundOutputReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeCompoundOutputReq)e.getUnfinishedMessage();
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
            public int getCompoundGroupId() {
                return this.compoundGroupId_;
            }
            
            public Builder setCompoundGroupId(final int value) {
                this.compoundGroupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCompoundGroupId() {
                this.compoundGroupId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCompoundId() {
                return this.compoundId_;
            }
            
            public Builder setCompoundId(final int value) {
                this.compoundId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCompoundId() {
                this.compoundId_ = 0;
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
    
    public interface TakeCompoundOutputReqOrBuilder extends MessageOrBuilder
    {
        int getCompoundGroupId();
        
        int getCompoundId();
    }
}
