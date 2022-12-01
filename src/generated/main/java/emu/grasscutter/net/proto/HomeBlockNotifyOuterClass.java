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

public final class HomeBlockNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBlockNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBlockNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBlockNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBlockNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015HomeBlockNotify.proto\"#\n\u000fHomeBlockNotify\u0012\u0010\n\bend_time\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBlockNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeBlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBlockNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_descriptor, new String[] { "EndTime" });
    }
    
    public static final class HomeBlockNotify extends GeneratedMessageV3 implements HomeBlockNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int END_TIME_FIELD_NUMBER = 3;
        private int endTime_;
        private byte memoizedIsInitialized;
        private static final HomeBlockNotify DEFAULT_INSTANCE;
        private static final Parser<HomeBlockNotify> PARSER;
        
        private HomeBlockNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBlockNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBlockNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBlockNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.endTime_ = input.readUInt32();
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
            return HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockNotify.class, Builder.class);
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
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
            if (this.endTime_ != 0) {
                output.writeUInt32(3, this.endTime_);
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
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.endTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBlockNotify)) {
                return super.equals(obj);
            }
            final HomeBlockNotify other = (HomeBlockNotify)obj;
            return this.getEndTime() == other.getEndTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getEndTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBlockNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBlockNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBlockNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBlockNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockNotify.PARSER, input);
        }
        
        public static HomeBlockNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockNotify.PARSER, input);
        }
        
        public static HomeBlockNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockNotify.PARSER, input);
        }
        
        public static HomeBlockNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBlockNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBlockNotify prototype) {
            return HomeBlockNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBlockNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBlockNotify getDefaultInstance() {
            return HomeBlockNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBlockNotify> parser() {
            return HomeBlockNotify.PARSER;
        }
        
        @Override
        public Parser<HomeBlockNotify> getParserForType() {
            return HomeBlockNotify.PARSER;
        }
        
        @Override
        public HomeBlockNotify getDefaultInstanceForType() {
            return HomeBlockNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBlockNotify();
            PARSER = new AbstractParser<HomeBlockNotify>() {
                @Override
                public HomeBlockNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBlockNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBlockNotifyOrBuilder
        {
            private int endTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBlockNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.endTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBlockNotifyOuterClass.internal_static_HomeBlockNotify_descriptor;
            }
            
            @Override
            public HomeBlockNotify getDefaultInstanceForType() {
                return HomeBlockNotify.getDefaultInstance();
            }
            
            @Override
            public HomeBlockNotify build() {
                final HomeBlockNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBlockNotify buildPartial() {
                final HomeBlockNotify result = new HomeBlockNotify(this);
                result.endTime_ = this.endTime_;
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
                if (other instanceof HomeBlockNotify) {
                    return this.mergeFrom((HomeBlockNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBlockNotify other) {
                if (other == HomeBlockNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
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
                HomeBlockNotify parsedMessage = null;
                try {
                    parsedMessage = HomeBlockNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBlockNotify)e.getUnfinishedMessage();
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
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
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
    
    public interface HomeBlockNotifyOrBuilder extends MessageOrBuilder
    {
        int getEndTime();
    }
}
