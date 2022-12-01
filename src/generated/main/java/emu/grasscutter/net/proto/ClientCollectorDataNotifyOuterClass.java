// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ClientCollectorDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ClientCollectorDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClientCollectorDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ClientCollectorDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ClientCollectorDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fClientCollectorDataNotify.proto\u001a\u0019ClientCollectorData.proto\"U\n\u0019ClientCollectorDataNotify\u00128\n\u001aclient_collector_data_list\u0018\r \u0003(\u000b2\u0014.ClientCollectorDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ClientCollectorDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ClientCollectorDataOuterClass.getDescriptor() });
        internal_static_ClientCollectorDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ClientCollectorDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor, new String[] { "ClientCollectorDataList" });
        ClientCollectorDataOuterClass.getDescriptor();
    }
    
    public static final class ClientCollectorDataNotify extends GeneratedMessageV3 implements ClientCollectorDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CLIENT_COLLECTOR_DATA_LIST_FIELD_NUMBER = 13;
        private List<ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_;
        private byte memoizedIsInitialized;
        private static final ClientCollectorDataNotify DEFAULT_INSTANCE;
        private static final Parser<ClientCollectorDataNotify> PARSER;
        
        private ClientCollectorDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ClientCollectorDataNotify() {
            this.memoizedIsInitialized = -1;
            this.clientCollectorDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ClientCollectorDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ClientCollectorDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.clientCollectorDataList_ = new ArrayList<ClientCollectorDataOuterClass.ClientCollectorData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.clientCollectorDataList_.add(input.readMessage(ClientCollectorDataOuterClass.ClientCollectorData.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.clientCollectorDataList_ = Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCollectorDataNotify.class, Builder.class);
        }
        
        @Override
        public List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
            return this.clientCollectorDataList_;
        }
        
        @Override
        public List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList() {
            return this.clientCollectorDataList_;
        }
        
        @Override
        public int getClientCollectorDataListCount() {
            return this.clientCollectorDataList_.size();
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int index) {
            return this.clientCollectorDataList_.get(index);
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int index) {
            return this.clientCollectorDataList_.get(index);
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
            for (int i = 0; i < this.clientCollectorDataList_.size(); ++i) {
                output.writeMessage(13, this.clientCollectorDataList_.get(i));
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
            for (int i = 0; i < this.clientCollectorDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.clientCollectorDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientCollectorDataNotify)) {
                return super.equals(obj);
            }
            final ClientCollectorDataNotify other = (ClientCollectorDataNotify)obj;
            return this.getClientCollectorDataListList().equals(other.getClientCollectorDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getClientCollectorDataListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getClientCollectorDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ClientCollectorDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorDataNotify.PARSER, input);
        }
        
        public static ClientCollectorDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ClientCollectorDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientCollectorDataNotify.PARSER, input);
        }
        
        public static ClientCollectorDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientCollectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ClientCollectorDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorDataNotify.PARSER, input);
        }
        
        public static ClientCollectorDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ClientCollectorDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ClientCollectorDataNotify prototype) {
            return ClientCollectorDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ClientCollectorDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ClientCollectorDataNotify getDefaultInstance() {
            return ClientCollectorDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ClientCollectorDataNotify> parser() {
            return ClientCollectorDataNotify.PARSER;
        }
        
        @Override
        public Parser<ClientCollectorDataNotify> getParserForType() {
            return ClientCollectorDataNotify.PARSER;
        }
        
        @Override
        public ClientCollectorDataNotify getDefaultInstanceForType() {
            return ClientCollectorDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ClientCollectorDataNotify();
            PARSER = new AbstractParser<ClientCollectorDataNotify>() {
                @Override
                public ClientCollectorDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ClientCollectorDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientCollectorDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_;
            private RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> clientCollectorDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCollectorDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.clientCollectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.clientCollectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ClientCollectorDataNotify.alwaysUseFieldBuilders) {
                    this.getClientCollectorDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.clientCollectorDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
            }
            
            @Override
            public ClientCollectorDataNotify getDefaultInstanceForType() {
                return ClientCollectorDataNotify.getDefaultInstance();
            }
            
            @Override
            public ClientCollectorDataNotify build() {
                final ClientCollectorDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ClientCollectorDataNotify buildPartial() {
                final ClientCollectorDataNotify result = new ClientCollectorDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.clientCollectorDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.clientCollectorDataList_ = Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.clientCollectorDataList_ = this.clientCollectorDataList_;
                }
                else {
                    result.clientCollectorDataList_ = this.clientCollectorDataListBuilder_.build();
                }
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
                if (other instanceof ClientCollectorDataNotify) {
                    return this.mergeFrom((ClientCollectorDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ClientCollectorDataNotify other) {
                if (other == ClientCollectorDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (!other.clientCollectorDataList_.isEmpty()) {
                        if (this.clientCollectorDataList_.isEmpty()) {
                            this.clientCollectorDataList_ = other.clientCollectorDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureClientCollectorDataListIsMutable();
                            this.clientCollectorDataList_.addAll(other.clientCollectorDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.clientCollectorDataList_.isEmpty()) {
                    if (this.clientCollectorDataListBuilder_.isEmpty()) {
                        this.clientCollectorDataListBuilder_.dispose();
                        this.clientCollectorDataListBuilder_ = null;
                        this.clientCollectorDataList_ = other.clientCollectorDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.clientCollectorDataListBuilder_ = (ClientCollectorDataNotify.alwaysUseFieldBuilders ? this.getClientCollectorDataListFieldBuilder() : null);
                    }
                    else {
                        this.clientCollectorDataListBuilder_.addAllMessages(other.clientCollectorDataList_);
                    }
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
                ClientCollectorDataNotify parsedMessage = null;
                try {
                    parsedMessage = ClientCollectorDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ClientCollectorDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureClientCollectorDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.clientCollectorDataList_ = new ArrayList<ClientCollectorDataOuterClass.ClientCollectorData>(this.clientCollectorDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                }
                return this.clientCollectorDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getClientCollectorDataListCount() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.size();
                }
                return this.clientCollectorDataListBuilder_.getCount();
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.get(index);
                }
                return this.clientCollectorDataListBuilder_.getMessage(index);
            }
            
            public Builder setClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllClientCollectorDataList(final Iterable<? extends ClientCollectorDataOuterClass.ClientCollectorData> values) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.clientCollectorDataList_);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearClientCollectorDataList() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeClientCollectorDataList(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder getClientCollectorDataListBuilder(final int index) {
                return this.getClientCollectorDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.get(index);
                }
                return this.clientCollectorDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList() {
                if (this.clientCollectorDataListBuilder_ != null) {
                    return this.clientCollectorDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>)this.clientCollectorDataList_);
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder() {
                return this.getClientCollectorDataListFieldBuilder().addBuilder(ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder(final int index) {
                return this.getClientCollectorDataListFieldBuilder().addBuilder(index, ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
            }
            
            public List<ClientCollectorDataOuterClass.ClientCollectorData.Builder> getClientCollectorDataListBuilderList() {
                return this.getClientCollectorDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListFieldBuilder() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataListBuilder_ = new RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>(this.clientCollectorDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.clientCollectorDataList_ = null;
                }
                return this.clientCollectorDataListBuilder_;
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
    
    public interface ClientCollectorDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList();
        
        ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int p0);
        
        int getClientCollectorDataListCount();
        
        List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList();
        
        ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int p0);
    }
}
