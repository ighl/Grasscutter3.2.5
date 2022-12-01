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

public final class HomeUpdateArrangementInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeUpdateArrangementInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeUpdateArrangementInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeUpdateArrangementInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeUpdateArrangementInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"HomeUpdateArrangementInfoRsp.proto\"/\n\u001cHomeUpdateArrangementInfoRsp\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeUpdateArrangementInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeUpdateArrangementInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeUpdateArrangementInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_descriptor, new String[] { "Retcode" });
    }
    
    public static final class HomeUpdateArrangementInfoRsp extends GeneratedMessageV3 implements HomeUpdateArrangementInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final HomeUpdateArrangementInfoRsp DEFAULT_INSTANCE;
        private static final Parser<HomeUpdateArrangementInfoRsp> PARSER;
        
        private HomeUpdateArrangementInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeUpdateArrangementInfoRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeUpdateArrangementInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeUpdateArrangementInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.retcode_ = input.readInt32();
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
            return HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUpdateArrangementInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeUpdateArrangementInfoRsp)) {
                return super.equals(obj);
            }
            final HomeUpdateArrangementInfoRsp other = (HomeUpdateArrangementInfoRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeUpdateArrangementInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeUpdateArrangementInfoRsp prototype) {
            return HomeUpdateArrangementInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeUpdateArrangementInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeUpdateArrangementInfoRsp getDefaultInstance() {
            return HomeUpdateArrangementInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeUpdateArrangementInfoRsp> parser() {
            return HomeUpdateArrangementInfoRsp.PARSER;
        }
        
        @Override
        public Parser<HomeUpdateArrangementInfoRsp> getParserForType() {
            return HomeUpdateArrangementInfoRsp.PARSER;
        }
        
        @Override
        public HomeUpdateArrangementInfoRsp getDefaultInstanceForType() {
            return HomeUpdateArrangementInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeUpdateArrangementInfoRsp();
            PARSER = new AbstractParser<HomeUpdateArrangementInfoRsp>() {
                @Override
                public HomeUpdateArrangementInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeUpdateArrangementInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeUpdateArrangementInfoRspOrBuilder
        {
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUpdateArrangementInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeUpdateArrangementInfoRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeUpdateArrangementInfoRspOuterClass.internal_static_HomeUpdateArrangementInfoRsp_descriptor;
            }
            
            @Override
            public HomeUpdateArrangementInfoRsp getDefaultInstanceForType() {
                return HomeUpdateArrangementInfoRsp.getDefaultInstance();
            }
            
            @Override
            public HomeUpdateArrangementInfoRsp build() {
                final HomeUpdateArrangementInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeUpdateArrangementInfoRsp buildPartial() {
                final HomeUpdateArrangementInfoRsp result = new HomeUpdateArrangementInfoRsp(this);
                result.retcode_ = this.retcode_;
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
                if (other instanceof HomeUpdateArrangementInfoRsp) {
                    return this.mergeFrom((HomeUpdateArrangementInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeUpdateArrangementInfoRsp other) {
                if (other == HomeUpdateArrangementInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                HomeUpdateArrangementInfoRsp parsedMessage = null;
                try {
                    parsedMessage = HomeUpdateArrangementInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeUpdateArrangementInfoRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface HomeUpdateArrangementInfoRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
    }
}
